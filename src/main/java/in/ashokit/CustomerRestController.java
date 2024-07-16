package in.ashokit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerRestController 
{
	@GetMapping("/")
	public Customer getCustomer()
	{
		Customer c=new Customer();
		c.setId(111);
		c.setName("sonu");
		c.setEmail("abhijeet173@gmail.com");
		c.setPhno(7978631865l);
		
		return c;
	}

}
