/**
 * Copyright (C) 2011 Jens Haase
 */
package com.github.jenshaase.uimascala.core.util

import org.apache.uima.jcas.JCas
import org.apache.uima.util.CasCreationUtils
import org.apache.uima.fit.factory.TypeSystemDescriptionFactory

/**
 * @author Jens Haase <je.haase@googlemail.com>
 */

trait Helper {

  def newJCas: JCas = {
    CasCreationUtils.createCas(
      TypeSystemDescriptionFactory.createTypeSystemDescription, null, null).getJCas
  }
}
