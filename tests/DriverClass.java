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

package tests;

import ace.Ace;

/**
 * This class starts the main program in test mode.
 */
public final class DriverClass
{
   /**
    * It becomes a utilities class, blocking its instantiation.
    */
   private DriverClass()
   {
   }
   
   /**
    * Main method that starts running the tests
    * 
    * @param args the arguments passed from the command line
    */
   public static void main( final String... args )
   {
      Ace.main( "teste" );
   }
}
