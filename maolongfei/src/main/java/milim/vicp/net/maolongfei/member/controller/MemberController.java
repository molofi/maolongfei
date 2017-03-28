package milim.vicp.net.maolongfei.member.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import milim.vicp.net.maolongfei.member.bean.Member;

@RestController("api/member")
public class MemberController {
    
    private final AtomicLong counter = new AtomicLong();
    @RequestMapping(value="/{name}",method={RequestMethod.GET})
    public Member member(@RequestParam(value="name",defaultValue="毛龙飞")String memberName){
        return new Member(counter.decrementAndGet(),memberName);
    }
}
