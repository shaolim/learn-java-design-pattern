package shaolim.learn.designpattern.builder;

public class User {
    private String name;
    private String avatarUrl;
    private String email;
    private String phone;
    private String jobPositionLevel;
    private String gender;
    private String birthday;

     private User(String name,
                  String avatarUrl,
                  String email,
                  String phone,
                  String jobPositionLevel,
                  String gender,
                  String birthday) {
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.email = email;
        this.phone = phone;
        this.jobPositionLevel = jobPositionLevel;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getJobPositionLevel() {
        return jobPositionLevel;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public static class Builder {
        private String name;
        private String avatarUrl;
        private String email;
        private String phone;
        private String jobPositionLevel;
        private String gender;
        private String birthday;

        public Builder() {}

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setJobPositionLevel(String jobPositionLevel) {
            this.jobPositionLevel = jobPositionLevel;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }

        public User build() {
            return new User(name, avatarUrl, email, phone, jobPositionLevel, gender, birthday);
        }
    }
}
