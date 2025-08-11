package stepdefinations;

import io.cucumber.java.en.*;

public class CalculatorSteps {
	
	int num1, num2, result;
	
	@Given("I have two numbers {int} and {int}")
	public void i_have_two_numbers_and(Integer int1, Integer int2) {
	    num1 = int1;
	    num2 = int2;
	}

	@When("I add them")
	public void i_add_them() {
	    result = num1+num2;
	}

	

	@When("I subtract them")
	public void i_subtract_them() {
	   result = num1- num2;
	}
	
	
	@Then("I get {int} as result")
	public void i_get_as_result(Integer expected) {
		if(result !=expected) {
				throw new AssertionError("expecte"+ expected + "but got "+ "reuslt");
		}
	    
	}


}
