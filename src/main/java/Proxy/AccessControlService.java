package Proxy;

import java.util.HashMap;
import java.util.Map;

public class AccessControlService {
    private static AccessControlService instance = null;
    private Map<String, String> accessControlList;

    private AccessControlService() {
        accessControlList = new HashMap<>();
    }

    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public boolean isAllowed(String documentId, String username) {
        String allowedUser = accessControlList.get(documentId);
        return allowedUser != null && allowedUser.equals(username);
    }

    public void grantAccess(String documentId, String username) {
        accessControlList.put(documentId, username);
    }
}
