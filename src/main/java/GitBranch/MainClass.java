package GitBranch;

import feign.Feign;
import feign.gson.GsonDecoder;


public class MainClass {

    public static String USER_NAME = "feign";



    public static void main(String[] args) {

        BranchInterface gitlab = Feign.builder()
                .decoder(new GsonDecoder())
                .target(BranchInterface.class, "https://api.github.com/");

        BranchResponse response = gitlab.branch(USER_NAME);

            System.out.println(response.id + " " +response.followers_url + " " + response.gists_url);
    }
}
