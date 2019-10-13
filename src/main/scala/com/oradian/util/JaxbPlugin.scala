package com.oradian.util

import scala.tools.nsc.Global
import scala.tools.nsc.plugins.{Plugin, PluginComponent}

class JaxbPlugin(val global: Global) extends Plugin {
  override val name: String = "jaxb-plugin"
  override val components: List[PluginComponent] = Nil
  override val description: String = "Noop plugin for injecting JAXB library into compilation classloader"
}
