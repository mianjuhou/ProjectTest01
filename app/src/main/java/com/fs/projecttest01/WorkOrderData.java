package com.fs.projecttest01;

import java.util.List;

/**
 * Created by fangdean on 2016/3/12.
 */
public class WorkOrderData {

    /**
     * endtime : 18:00,
     * lead : 吴仲华(13608677801)
     * linename : 京广
     * linetype : 双
     * location : 京广-上行-线(724.5-725),京广-下(724.5-725)
     * locationdata : [{"assetnum":"PXL000001","classstructureid":"1322","description":"京广-下行-线","endmeasure":"725","line":[{"planvalue":[],"qhxc":150,"qxbj":1800,"xxqc":1023.9,"zhxc":150},{"planvalue":[],"qhxc":0,"qxbj":15000,"xxqc":82.39,"zhxc":0},{"planvalue":[],"qhxc":0,"qxbj":14000,"xxqc":80.77,"zhxc":0},{"planvalue":[],"qhxc":130,"qxbj":2000,"xxqc":1183.25,"zhxc":130},{"planvalue":[],"qhxc":0,"qxbj":20000,"xxqc":82.32,"zhxc":0},{"planvalue":[],"qhxc":0,"qxbj":20000,"xxqc":83.29,"zhxc":0},{"planvalue":[],"qhxc":150,"qxbj":1800,"xxqc":441.55,"zhxc":150},{"planvalue":[],"qhxc":40,"qxbj":6000,"xxqc":161.5,"zhxc":40},{"planvalue":[],"qhxc":40,"qxbj":6000,"xxqc":163.37,"zhxc":40},{"planvalue":[],"qhxc":150,"qxbj":1800,"xxqc":1172.17,"zhxc":150},{"planvalue":[],"qhxc":130,"qxbj":2000,"xxqc":458.71,"zhxc":130},{"planvalue":[],"qhxc":130,"qxbj":2000,"xxqc":458.71,"zhxc":130},{"planvalue":[],"qhxc":150,"qxbj":1800,"xxqc":1172.17,"zhxc":150},{"planvalue":[],"qhxc":40,"qxbj":6000,"xxqc":163.37,"zhxc":40},{"planvalue":[],"qhxc":40,"qxbj":6000,"xxqc":161.5,"zhxc":40},{"planvalue":[],"qhxc":150,"qxbj":1800,"xxqc":441.55,"zhxc":150},{"planvalue":[],"qhxc":0,"qxbj":20000,"xxqc":83.29,"zhxc":0},{"planvalue":[],"qhxc":0,"qxbj":20000,"xxqc":82.32,"zhxc":0},{"planvalue":[],"qhxc":130,"qxbj":2000,"xxqc":1183.25,"zhxc":130},{"planvalue":[],"qhxc":0,"qxbj":14000,"xxqc":80.77,"zhxc":0},{"planvalue":[],"qhxc":0,"qxbj":15000,"xxqc":82.39,"zhxc":0},{"planvalue":[],"qhxc":150,"qxbj":1800,"xxqc":1023.9,"zhxc":150}],"startmeasure":"724.5"},{"assetnum":"PXL000002","classstructureid":"1322","description":"京广-上行-线","endmeasure":"725","line":[{"planvalue":[],"qhxc":150,"qxbj":1800,"xxqc":441.3,"zhxc":150},{"planvalue":[],"qhxc":130,"qxbj":1800,"xxqc":1152.3,"zhxc":130},{"planvalue":[],"qhxc":140,"qxbj":2000,"xxqc":468.44,"zhxc":140},{"planvalue":[],"qhxc":130,"qxbj":2000,"xxqc":1183.78,"zhxc":130},{"planvalue":[],"qhxc":160,"qxbj":1700,"xxqc":986,"zhxc":160},{"planvalue":[],"qhxc":160,"qxbj":1700,"xxqc":986,"zhxc":160},{"planvalue":[],"qhxc":130,"qxbj":2000,"xxqc":1183.78,"zhxc":130},{"planvalue":[],"qhxc":140,"qxbj":2000,"xxqc":468.44,"zhxc":140},{"planvalue":[],"qhxc":130,"qxbj":1800,"xxqc":1152.3,"zhxc":130},{"planvalue":[],"qhxc":150,"qxbj":1800,"xxqc":441.3,"zhxc":150}],"startmeasure":"724.5"}]
     * planname : 整理外观(整理外观、)
     * schedstartdate : 2016-03-12
     * starttime : 08:00
     * wonum : zz31465
     * wotype : 天窗外
     */

    private String endtime;
    private String lead;
    private String linename;
    private String linetype;
    private String location;
    private String planname;
    private String schedstartdate;
    private String starttime;
    private String wonum;
    private String wotype;
    /**
     * assetnum : PXL000001
     * classstructureid : 1322
     * description : 京广-下行-线
     * endmeasure : 725
     * line : [{"planvalue":[],"qhxc":150,"qxbj":1800,"xxqc":1023.9,"zhxc":150},{"planvalue":[],"qhxc":0,"qxbj":15000,"xxqc":82.39,"zhxc":0},{"planvalue":[],"qhxc":0,"qxbj":14000,"xxqc":80.77,"zhxc":0},{"planvalue":[],"qhxc":130,"qxbj":2000,"xxqc":1183.25,"zhxc":130},{"planvalue":[],"qhxc":0,"qxbj":20000,"xxqc":82.32,"zhxc":0},{"planvalue":[],"qhxc":0,"qxbj":20000,"xxqc":83.29,"zhxc":0},{"planvalue":[],"qhxc":150,"qxbj":1800,"xxqc":441.55,"zhxc":150},{"planvalue":[],"qhxc":40,"qxbj":6000,"xxqc":161.5,"zhxc":40},{"planvalue":[],"qhxc":40,"qxbj":6000,"xxqc":163.37,"zhxc":40},{"planvalue":[],"qhxc":150,"qxbj":1800,"xxqc":1172.17,"zhxc":150},{"planvalue":[],"qhxc":130,"qxbj":2000,"xxqc":458.71,"zhxc":130},{"planvalue":[],"qhxc":130,"qxbj":2000,"xxqc":458.71,"zhxc":130},{"planvalue":[],"qhxc":150,"qxbj":1800,"xxqc":1172.17,"zhxc":150},{"planvalue":[],"qhxc":40,"qxbj":6000,"xxqc":163.37,"zhxc":40},{"planvalue":[],"qhxc":40,"qxbj":6000,"xxqc":161.5,"zhxc":40},{"planvalue":[],"qhxc":150,"qxbj":1800,"xxqc":441.55,"zhxc":150},{"planvalue":[],"qhxc":0,"qxbj":20000,"xxqc":83.29,"zhxc":0},{"planvalue":[],"qhxc":0,"qxbj":20000,"xxqc":82.32,"zhxc":0},{"planvalue":[],"qhxc":130,"qxbj":2000,"xxqc":1183.25,"zhxc":130},{"planvalue":[],"qhxc":0,"qxbj":14000,"xxqc":80.77,"zhxc":0},{"planvalue":[],"qhxc":0,"qxbj":15000,"xxqc":82.39,"zhxc":0},{"planvalue":[],"qhxc":150,"qxbj":1800,"xxqc":1023.9,"zhxc":150}]
     * startmeasure : 724.5
     */

    private List<LocationdataEntity> locationdata;

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public void setLead(String lead) {
        this.lead = lead;
    }

    public void setLinename(String linename) {
        this.linename = linename;
    }

    public void setLinetype(String linetype) {
        this.linetype = linetype;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPlanname(String planname) {
        this.planname = planname;
    }

    public void setSchedstartdate(String schedstartdate) {
        this.schedstartdate = schedstartdate;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public void setWonum(String wonum) {
        this.wonum = wonum;
    }

    public void setWotype(String wotype) {
        this.wotype = wotype;
    }

    public void setLocationdata(List<LocationdataEntity> locationdata) {
        this.locationdata = locationdata;
    }

    public String getEndtime() {
        return endtime;
    }

    public String getLead() {
        return lead;
    }

    public String getLinename() {
        return linename;
    }

    public String getLinetype() {
        return linetype;
    }

    public String getLocation() {
        return location;
    }

    public String getPlanname() {
        return planname;
    }

    public String getSchedstartdate() {
        return schedstartdate;
    }

    public String getStarttime() {
        return starttime;
    }

    public String getWonum() {
        return wonum;
    }

    public String getWotype() {
        return wotype;
    }

    public List<LocationdataEntity> getLocationdata() {
        return locationdata;
    }

    public static class LocationdataEntity {
        private String assetnum;
        private String classstructureid;
        private String description;
        private String endmeasure;
        private String startmeasure;
        /**
         * planvalue : []
         * qhxc : 150
         * qxbj : 1800
         * xxqc : 1023.9
         * zhxc : 150
         */

        private List<LineEntity> line;

        public void setAssetnum(String assetnum) {
            this.assetnum = assetnum;
        }

        public void setClassstructureid(String classstructureid) {
            this.classstructureid = classstructureid;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setEndmeasure(String endmeasure) {
            this.endmeasure = endmeasure;
        }

        public void setStartmeasure(String startmeasure) {
            this.startmeasure = startmeasure;
        }

        public void setLine(List<LineEntity> line) {
            this.line = line;
        }

        public String getAssetnum() {
            return assetnum;
        }

        public String getClassstructureid() {
            return classstructureid;
        }

        public String getDescription() {
            return description;
        }

        public String getEndmeasure() {
            return endmeasure;
        }

        public String getStartmeasure() {
            return startmeasure;
        }

        public List<LineEntity> getLine() {
            return line;
        }

        public static class LineEntity {
            private int qhxc;
            private int qxbj;
            private double xxqc;
            private int zhxc;
            private List<?> planvalue;

            public void setQhxc(int qhxc) {
                this.qhxc = qhxc;
            }

            public void setQxbj(int qxbj) {
                this.qxbj = qxbj;
            }

            public void setXxqc(double xxqc) {
                this.xxqc = xxqc;
            }

            public void setZhxc(int zhxc) {
                this.zhxc = zhxc;
            }

            public void setPlanvalue(List<?> planvalue) {
                this.planvalue = planvalue;
            }

            public int getQhxc() {
                return qhxc;
            }

            public int getQxbj() {
                return qxbj;
            }

            public double getXxqc() {
                return xxqc;
            }

            public int getZhxc() {
                return zhxc;
            }

            public List<?> getPlanvalue() {
                return planvalue;
            }
        }
    }
}
