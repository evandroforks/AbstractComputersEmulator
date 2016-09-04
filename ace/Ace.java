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

package ace;

import ace.graphical_interface.MainWindow;

/**
 *
 * @author Professional
 */
public final class Ace
{
   private final String HELP_MESSAGE = "Invalid command! \n";
   
   private Ace()
   {
   }
   
   /**
    * Main method that starts program execution. Performs the parameters reading from the command
    * line. If there is no parameter, starts the GUI system.
    *
    * @param args command line arguments passed to this program.
    */
   public static void main( final String... args )
   {
      new Ace().startSystem( args );
   }
   
   /**
    * Starts the system from main method by non static context.
    *
    * @param args an argument array
    */
   private void startSystem( final String[] args )
   {
      if( ( args == null ) || ( args.length == 0 ) )
      {
         MainWindow.getInstance();
      }
      else
      {
         switch( args[0] )
         {
         case "help":
            System.out.println( this.HELP_MESSAGE );
            break;
            
         default:
            System.out.println( this.HELP_MESSAGE + args[0] );
            break;
         }
         
      }
   }
}
