import adapters.Project;
import adapters.ProjectAdapter;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.net.HttpURLConnection.HTTP_OK;

public class ApiTests {
    @Test
    public void checkMethodGet() {
        int statusCode = new ProjectAdapter().verifyGet().statusCode();
        Assert.assertEquals(statusCode, HTTP_OK, "Статускод метода GET не соответствует");
    }

    @Test
    public void checkMethodPostWithoutBody() {
        int statusCode = new ProjectAdapter().verifyPostWithoutBody().statusCode();
        Assert.assertEquals(statusCode, HTTP_OK, "Статускод метода POST не соответствует");
    }

    @Test
    public void checkMethodPost() {
        Project project = Project.builder()
                .foo1("bar1")
                .foo2("bar2")
                .build();
        int statusCode = new ProjectAdapter().verifyPost(project).statusCode();
        Assert.assertEquals(statusCode, HTTP_OK, "Статускод метода POST не соответствует");
    }

    @Test
    public void checkMethodPut() {
        int statusCode = new ProjectAdapter().verifyPut().statusCode();
        Assert.assertEquals(statusCode, HTTP_OK, "Статускод метода PUT не соответствует");
    }

    @Test
    public void checkMethodPatch() {
        int statusCode = new ProjectAdapter().verifyPatch().statusCode();
        Assert.assertEquals(statusCode, HTTP_OK, "Статускод метода PATCH не соответствует");
    }

    @Test
    public void checkMethodDelete() {
        int statusCode = new ProjectAdapter().verifyDelete().statusCode();
        Assert.assertEquals(statusCode, HTTP_OK, "Статускод метода DELETE не соответствует");
    }
}
