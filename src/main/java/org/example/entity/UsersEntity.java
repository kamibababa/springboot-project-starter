package org.example.entity;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("users")
public class UsersEntity {
    /** 版本号 */
    private static final long serialVersionUID = -61540348507379010L;

    @Override
    public String toString() {
        return "UsersEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", bio='" + bio + '\'' +
                ", image='" + image + '\'' +
                '}';
    }

    /**  */
    private Long id;
    
    /**  */
    private String username;
    
    /**  */
    private String password;
    
    /**  */
    private String email;
    
    /**  */
    private String bio;
    
    /**  */
    private String image;
    
    /**
     * 获取
     * 
     * @return 
     */
    public Long getId() {
        return this.id;
    }
     
    /**
     * 设置
     * 
     * @param id
     *          
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getUsername() {
        return this.username;
    }
     
    /**
     * 设置
     * 
     * @param username
     *          
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getPassword() {
        return this.password;
    }
     
    /**
     * 设置
     * 
     * @param password
     *          
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getEmail() {
        return this.email;
    }
     
    /**
     * 设置
     * 
     * @param email
     *          
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getBio() {
        return this.bio;
    }
     
    /**
     * 设置
     * 
     * @param bio
     *          
     */
    public void setBio(String bio) {
        this.bio = bio;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getImage() {
        return this.image;
    }
     
    /**
     * 设置
     * 
     * @param image
     *          
     */
    public void setImage(String image) {
        this.image = image;
    }
}