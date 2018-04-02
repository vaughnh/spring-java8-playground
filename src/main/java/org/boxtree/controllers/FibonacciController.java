package org.boxtree.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FibonacciController {
    @GetMapping("/fibonacci")
    @ResponseBody
    public Integer fib(@RequestParam(name="ordinal", required=true) Integer ordinal) {
        return new Integer(0);
    }
}
