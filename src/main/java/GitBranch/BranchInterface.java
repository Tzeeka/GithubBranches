package GitBranch;

import feign.Param;
import feign.RequestLine;



public interface BranchInterface {

    @RequestLine("GET /users/{username}")
    BranchResponse branch(@Param("username") String username);
}
