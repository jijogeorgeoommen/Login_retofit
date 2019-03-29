
package com.example.login_retofit;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class JobDetail {

    @Expose
    private String deadline;
    @Expose
    private String id;
    @Expose
    private String jobdes;
    @Expose
    private String jobtitle;
    @Expose
    private String plc;
    @Expose
    private String userid;

    public String getDeadline() {
        return deadline;
    }

    public String getId() {
        return id;
    }

    public String getJobdes() {
        return jobdes;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public String getPlc() {
        return plc;
    }

    public String getUserid() {
        return userid;
    }

    public static class Builder {

        private String deadline;
        private String id;
        private String jobdes;
        private String jobtitle;
        private String plc;
        private String userid;

        public JobDetail.Builder withDeadline(String deadline) {
            this.deadline = deadline;
            return this;
        }

        public JobDetail.Builder withId(String id) {
            this.id = id;
            return this;
        }

        public JobDetail.Builder withJobdes(String jobdes) {
            this.jobdes = jobdes;
            return this;
        }

        public JobDetail.Builder withJobtitle(String jobtitle) {
            this.jobtitle = jobtitle;
            return this;
        }

        public JobDetail.Builder withPlc(String plc) {
            this.plc = plc;
            return this;
        }

        public JobDetail.Builder withUserid(String userid) {
            this.userid = userid;
            return this;
        }

        public JobDetail build() {
            JobDetail jobDetail = new JobDetail();
            jobDetail.deadline = deadline;
            jobDetail.id = id;
            jobDetail.jobdes = jobdes;
            jobDetail.jobtitle = jobtitle;
            jobDetail.plc = plc;
            jobDetail.userid = userid;
            return jobDetail;
        }

    }

}
