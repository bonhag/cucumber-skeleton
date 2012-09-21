// This file creates a binding between Geb and Cucumber

import geb.binding.BindingUpdater
import geb.Browser

import static cucumber.runtime.groovy.Hooks.*

Before () {
	bindingUpdater = new BindingUpdater (binding, new Browser ())
	bindingUpdater.initialize()
}

After () {
	bindingUpdater.remove()
}

