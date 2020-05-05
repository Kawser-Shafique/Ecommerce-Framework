@CartContent
Feature: Cart Contents Functionality test.

	Scenario: Customer Can Add A Product to Cart Contents From Categories.
		
		Given User on Homepage 
		When User click hardware under catagories section.
		And User click printer 
		And User click buy now
		And User open my Cart Content
		Then User should see printer in my Cart Content