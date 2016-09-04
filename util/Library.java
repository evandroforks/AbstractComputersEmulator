/**
 * Copyright (C) 2015 Evandro Coan
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program. If
 * not, see <http://www.gnu.org/licenses/>.
 */

package util;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;

/**
 * Library of functions for operating.
 *
 * @authors Evandro Coan
 */
public final class Library
{
   /**
    * It becomes a utilities class, blocking its instantiation.
    */
   private Library()
   {
   }
   
   /**
    * Configure the fonts of all the component parts, for the passed font as parameter.
    *
    * @param compoment the component to have changed font.
    * @param newFont the new source to be used by components
    */
   public static void changeTextFonts( final Component compoment, final Font newFont )
   {
      compoment.setFont( newFont );
      
      if( compoment instanceof Container )
      {
         for( final Component child: ( (Container) compoment ).getComponents() )
         {
            Library.changeTextFonts( child, newFont );
         }
      }
   }
   
   /**
    * Generates random number between 1 and 100.
    *
    * @return a random number between 1 and 100.
    */
   public static int genarateRandom_number()
   {
      final double random = Math.random();
      
      return (int) ( random * 100 ) + 1;
   }
   
   /**
    * Breaks the line 10 counts the counter.
    *
    * @param counter a number of symbols occurring.
    *           
    * @return true if you need to break the line.
    */
   public static boolean isTimeToBreakLine( final int counter )
   {
      return ( counter % 10 ) == 9;
   }
}
