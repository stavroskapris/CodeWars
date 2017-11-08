package katas.test;

import static org.junit.Assert.*;

import org.junit.Test;

import katas.FileNameExtractor;

public class FileNameExtractorTest {
	@Test
    public void testSample() {
      assertEquals(
          "FILE_NAME.EXTENSION",
          FileNameExtractor.extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION")
      );
		assertEquals(
          "FILE_NAME.EXTENSION",
          FileNameExtractor.extractFileName("1_FILE_NAME.EXTENSION.OTHEREXTENSIONadasdassdassds34")
      );
    }
}


