package space.bum.smvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping()
@Slf4j
public class PaymentController {

  @PostMapping("/pay_result")
  public String payResult2(@ModelAttribute Payment payment) {
    log.info("post 결과 금액: {}", payment.toString());
    return "pay_result";
  }

  @PostMapping("/pay_form")
  public String processPayment(@ModelAttribute Payment payment) {
    log.info("공과금 지불 금액: {}", payment.toString());
    return "redirect:pay_result";
  }

  @GetMapping("/pay_result")
  public String payResult1(@ModelAttribute Payment payment) {
    log.info("get 결과 금액: {}", payment.toString());
    return "pay_result";
  }

  @GetMapping("/pay_form")
  public String showPayForm() {
    return "pay_form";
  }

  @ModelAttribute(name = "payment")
  public Payment payment() {
    return new Payment();
  }
}
