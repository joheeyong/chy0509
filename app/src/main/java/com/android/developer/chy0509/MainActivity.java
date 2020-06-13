package com.android.developer.chy0509;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    //구글맵참조변수
    GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // SupportMapFragment을 통해 레이아웃에 만든 fragment의 ID를 참조하고 구글맵을 호출한다.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this); //getMapAsync must be called on the main thread.
    }

    @Override //구글맵을 띄울준비가 됬으면 자동호출된다.
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        //지도타입 - 일반
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        manyMarker();
        //  oneMarker();
        //manyMarker();
    }

    //마커하나찍는 기본 예제

    public void oneMarker() {
        // 서울 여의도에 대한 위치 설정
        LatLng seoul = new LatLng(37.487101, 126.820526);

        // 구글 맵에 표시할 마커에 대한 옵션 설정  (알파는 좌표의 투명도이다.)
        MarkerOptions makerOptions = new MarkerOptions();
        makerOptions
                .position(seoul)
                .title("원하는 위치(위도, 경도)에 마커를 표시했습니다.")
                .snippet("유한대학교")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
                .alpha(0.5f);

        // 마커를 생성한다. showInfoWindow를 쓰면 처음부터 마커에 상세정보가 뜨게한다. (안쓰면 마커눌러야뜸)
        mMap.addMarker(makerOptions); //.showInfoWindow();

        //정보창 클릭 리스너
        mMap.setOnInfoWindowClickListener(infoWindowClickListener);

        //마커 클릭 리스너
        mMap.setOnMarkerClickListener(markerClickListener);

        //카메라를 여의도 위치로 옮긴다.
        // mMap.moveCamera(CameraUpdateFactory.newLatLng(seoul));
        //처음 줌 레벨 설정 (해당좌표=>서울, 줌레벨(16)을 매개변수로 넣으면 된다.) (위에 코드대신 사용가능)(중첩되면 이걸 우선시하는듯)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(seoul, 16));

        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                Toast.makeText(MainActivity.this, "눌렀습니다!!", Toast.LENGTH_LONG);
                return false;
            }
        });



    }

    ////////////////////////  구글맵 마커 여러개생성 및 띄우기 //////////////////////////
    double[] la = new double[13];
    double[] lo = new double[13];
    String[] ti = new String[13];
    String[] sn = new String[13];



    MarkerOptions makerOptions;
    public void manyMarker() {
        la[0] = 37.487984;
        lo[0] = 126.819827;
        ti[0] = "혜영반점";
        sn[0] = "음식은 기름진게 최고!";

        la[1] = 37.487209;
        lo[1] = 126.820532;
        ti[1] = "유한대학교 학식";
        sn[1] = "학식충이 되고싶나요?";

        la[2] = 37.488715;
        lo[2] = 126.820089;
        ti[2] = "돈이조아";
        sn[2] = "탁월한 선택이군요.";

        la[3] = 37.488342;
        lo[3] = 126.819032;
        ti[3] = "유한반점";
        sn[3] = "최고의 맛과 서비스";


        la[4] = 37.488665;
        lo[4] = 126.820051;
        ti[4] = "엄마 손 분식";
        sn[4] = "추억의 분식을 맛봐요";

        la[5] = 37.487473;
        lo[5] = 126.818667;
        ti[5] = "GS25";
        sn[5] = "가끔은 편의점 음식도 좋잖아~";


        // for loop를 통한 n개의 마커 생성
        for (int idx = 0; idx < 13; idx++) {
            // 1. 마커 옵션 설정 (만드는 과정)
            makerOptions = new MarkerOptions();
            makerOptions // LatLng에 대한 어레이를 만들어서 이용할 수도 있다.
                    .position(new LatLng(la[idx], lo[idx]))
                    .title(ti[idx])
                    .snippet(sn[idx])
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
                    .alpha(0.5f);
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(la[idx], lo[idx]),16));






            // 2. 마커 생성 (마커를 나타냄)
            mMap.addMarker(makerOptions);


        }
        //정보창 클릭 리스너
        mMap.setOnInfoWindowClickListener(infoWindowClickListener);

        //마커 클릭 리스너
        mMap.setOnMarkerClickListener(markerClickListener);

        // 카메라를 위치로 옮긴다.
        mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(37.487101, 126.820526)));
    }

    //마커정보창 클릭리스너는 다작동하나, 마커클릭리스너는 snippet정보가 있으면 중복되어 이벤트처리가 안되는거같다.
    // oneMarker(); 는 동작하지않으나 manyMarker(); 는 snippet정보가 없어 동작이가능하다.

    //정보창 클릭 리스너
    GoogleMap.OnInfoWindowClickListener infoWindowClickListener = new GoogleMap.OnInfoWindowClickListener() {
        @Override
        public void onInfoWindowClick(Marker marker) {
            String markerId = marker.getId();
            Toast.makeText(MainActivity.this, "정보창 클릭 Marker ID : "+markerId, Toast.LENGTH_SHORT).show();
        }
    };

    //마커 클릭 리스너
    GoogleMap.OnMarkerClickListener markerClickListener = new GoogleMap.OnMarkerClickListener() {
        @Override
        public boolean onMarkerClick(Marker marker) {
            String markerId = marker.getId();
            //선택한 타겟위치
            LatLng location = marker.getPosition();
            Toast.makeText(MainActivity.this, markerId+"("+location.latitude+" "+location.longitude+")", Toast.LENGTH_SHORT).show();
            return false;
        }
    };

}