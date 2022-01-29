package user;

public enum Role {
    USER("user"),
    ADMIN("admin"),
    MODERATOR("moderator");

    private String roleName;

    Role(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public boolean equalsRole(String otherRole) {
        return this.roleName.equals(otherRole);
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleName='" + roleName + '\'' +
                '}';
    }
}
