package shaolim.learn.designpattern.builder;

public class UserApp {
    public static void main(String[] args) {
        User user = new User.Builder()
                .setName("Sapardi Djoko Damono")
                .setAvatarUrl("https://upload.wikimedia.org/wikipedia/commons/f/ff/Sapardi_Djoko_Damono.jpg")
                .setEmail("sapardi.djoko@gmail.com")
                .setPhone("081234567890")
                .setJobPositionLevel("CEO")
                .setGender("Laki-laki")
                .setBirthday("1940-03-20")
                .build();

        System.out.println("Name: " + user.getName());
        System.out.println("Avatar Url: " + user.getAvatarUrl());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Phone: " + user.getPhone());
        System.out.println("Job Position Level: " + user.getJobPositionLevel());
        System.out.println("Gender: " + user.getGender());
        System.out.println("Birthday: " + user.getBirthday());
    }
}
