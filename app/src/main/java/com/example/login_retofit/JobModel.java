
package com.example.login_retofit;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class JobModel {

    @SerializedName("Job Details")
    private List<JobDetail> jobDetails;
    @SerializedName("Status")
    private String status;

    public List<JobDetail> getJobDetails() {
        return jobDetails;
    }

    public String getStatus() {
        return status;
    }

    public static class Builder {

        private List<JobDetail> jobDetails;
        private String status;

        public JobModel.Builder withJobDetails(List<JobDetail> jobDetails) {
            this.jobDetails = jobDetails;
            return this;
        }

        public JobModel.Builder withStatus(String status) {
            this.status = status;
            return this;
        }

        public JobModel build() {
            JobModel jobModel = new JobModel();
            jobModel.jobDetails = jobDetails;
            jobModel.status = status;
            return jobModel;
        }

    }

}
