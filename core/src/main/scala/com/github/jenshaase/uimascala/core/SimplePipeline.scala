/**
 * Copyright (C) 2011 Jens Haase
 */
package com.github.jenshaase.uimascala.core

import org.apache.uima.analysis_engine.AnalysisEngine
import org.apache.uima.collection.CollectionReader

@deprecated("Use org.apache.uima.fit.pipeline.SimplePipeline or uimascala-stream", "0.5.0")
class SimplePipeline(reader: CollectionReader) {

  private var descs: Seq[AnalysisEngine] = Seq.empty

  def ~>(in: AsAnalysisEngine): SimplePipeline =
    ~>(in.asAnalysisEngine)

  def ~>(in: AnalysisEngine): SimplePipeline = {
    descs = descs :+ in
    this
  }

  def run() = {
    org.apache.uima.fit.pipeline.SimplePipeline.runPipeline(reader, descs: _*)
  }
}

object SimplePipeline {

  def apply(reader: CollectionReader) =
    new SimplePipeline(reader)

  def apply(reader: SCasCollectionReader_ImplBase) =
    new SimplePipeline(reader.asCollectionReader)
}
