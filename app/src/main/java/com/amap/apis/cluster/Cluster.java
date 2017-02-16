package com.amap.apis.cluster;

import com.baidu.mapapi.map.Marker;
import com.baidu.mapapi.model.LatLng;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yiyi.qi on 16/10/10.
 */

public class Cluster implements Serializable{
    private LatLng mLatLng;
    private List<ClusterItem> mClusterItems;
    private Marker mMarker;

    Cluster(LatLng latLng) {
        mLatLng = latLng;
        mClusterItems = new ArrayList<>();
    }

    void addClusterItem(ClusterItem clusterItem) {
        mClusterItems.add(clusterItem);
    }

    int getClusterCount() {
        return mClusterItems.size();
    }

    LatLng getCenterLatLng() {
        return mLatLng;
    }

    Marker getMarker() {
        return mMarker;
    }

    void setMarker(Marker marker) {
        mMarker = marker;
    }

    List<ClusterItem> getClusterItems() {
        return mClusterItems;
    }
}
