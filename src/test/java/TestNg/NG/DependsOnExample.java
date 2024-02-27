package TestNg.NG;

import org.testng.annotations.Test;

public class DependsOnExample {

    @Test
    public void login() {
        System.out.println("Logged in successfully");
    }

    @Test(dependsOnMethods = "login")
    public void createPost() {
        System.out.println("Post created successfully");
    }

    @Test(dependsOnMethods = "createPost")
    public void editPost() {
        System.out.println("Post edited successfully");
    }

    @Test(dependsOnMethods = {"createPost", "editPost"})
    public void deletePost() {
        System.out.println("Post deleted successfully");
    }
}
