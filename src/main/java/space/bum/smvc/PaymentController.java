package space.bum.smvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class PaymentController {
  @GetMapping("/pay_form")
  public String showPayForm() {
    return "pay_form";
  }
  
  @ModelAttribute(name = "payment")
  public Payment payment() {
    return new Payment();
  }
}
