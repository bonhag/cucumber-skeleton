import static cucumber.runtime.groovy.EN.*
import geb.Browser

Given(~'^I open a page$') { ->
	go 'some/url'
	// assertions go here
}

When(~'^I do "([^"]*)"$') { String thing ->
	assert true == false
}

Then(~'^I enjoy "([^"]*)"$') { String pleasure ->
	assert $("h1.expression").text() == pleasure
}
