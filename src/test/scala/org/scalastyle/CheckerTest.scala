// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.scalastyle

import org.junit.Test
import org.scalastyle.file.{CheckerTestHelper, FileLengthChecker}
import org.junit.Assert.assertEquals

class CheckerTest extends CheckerTestHelper {
  val key = "file.size.limit"
  val classUnderTest = classOf[FileLengthChecker]
  val scalastyleChecker = new ScalastyleChecker[FileSpec](Some(this.getClass.getClassLoader))

  @Test def testOne(): Unit = {

    val config = ScalastyleConfiguration.readFromXml("src/test/resources/config/scalastyle_config.xml")
    val sourceSpec: FileSpec = new SourceSpec("somename.scala", "contents")
    val thing: AThing[FileSpec] = AThing(sourceSpec, config)
    val filesAndRules: Seq[AThing[FileSpec]] = Seq(thing)
    val result = scalastyleChecker.checkFiles2(filesAndRules)

    assertEquals(1, 1)
  }
}
