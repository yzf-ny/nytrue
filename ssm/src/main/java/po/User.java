package po;

/**
 * Author:yzf
 * Date:2019/10/24 9:28
 * projectName:Mybatis
 **/
public class User {

    private Integer id;
    private Integer ids;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIds() {
        return ids;
    }

    public void setIds(Integer ids) {
        this.ids = ids;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", ids=" + ids +
                ", name='" + name + '\'' +
                '}';
    }

    public User() {

    }

    public User(Integer id, Integer ids, String name) {
        this.id = id;
        this.ids = ids;
        this.name = name;
    }
}
