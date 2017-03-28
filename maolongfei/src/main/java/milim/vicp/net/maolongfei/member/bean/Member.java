package milim.vicp.net.maolongfei.member.bean;

import java.io.Serializable;

public class Member implements Serializable{

    

    
    private static final long serialVersionUID = 2296167525292726525L;
    
    private Long id;
    private String memberNo;
    private String memberName;
    private String memberSex;
    private Integer memberAge;
    
    public Member(){
        
    }
    
    public Member(Long id, String memberName) {
        super();
        this.id = id;
        this.memberName = memberName;
    }


    public Long getId() {
        return id;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

    
    public String getMemberNo() {
        return memberNo;
    }

    
    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberName() {
        return memberName;
    }
    
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    
    public String getMemberSex() {
        return memberSex;
    }
    
    public void setMemberSex(String memberSex) {
        this.memberSex = memberSex;
    }
    
    public Integer getMemberAge() {
        return memberAge;
    }
    
    public void setMemberAge(Integer memberAge) {
        this.memberAge = memberAge;
    }
    
    
}
