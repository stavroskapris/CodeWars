/*You have to extract a portion of the file name as follows:
    Asume it will start with date represented as long number
    Followed by an underscore
    Youll have then a filename with an extension
    it will always have an extra extension at the end
Inputs:
1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION
1_This_is_an_otherExample.mpg.OTHEREXTENSIONadasdassdassds34
1231231223123131_myFile.tar.gz2
Outputs
FILE_NAME.EXTENSION
This_is_an_otherExample.mpg
myFile.tar
*/

package katas;

public class FileNameExtractor {

	public static void main(String[] args) {
		String s = "1231231223123131_myFile.tar.gz2";

		
		System.out.println(FileNameExtractor.extractFileName(s));

	}

	public static String extractFileName(String dirtyFileName) {
		int underScore = dirtyFileName.indexOf("_");
		int dot = dirtyFileName.lastIndexOf(".");
		
		return dirtyFileName.substring(underScore + 1, dot);
	}
}
