/**
 * 
 */
package net.docusign.receiver;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author csmith
 *
 */
public class OnlyXml implements FilenameFilter {

  /* (non-Javadoc)
   * @see java.io.FilenameFilter#accept(java.io.File, java.lang.String)
   */
  @Override
  public boolean accept(File dir, String name) {
    return name.endsWith(".xml");
  }

}
