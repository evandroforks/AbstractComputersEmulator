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

package ace.graphical_interface;

import java.awt.BorderLayout;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import ace.system_logic.Facade;

/**
 * Main window that contains the executing program.
 */
public final class MainWindow
{
   private static MainWindow instance;
   
   private final JPanel painel;
   private final JFrame window;
   
   /**
    * Holds the system_logic facade.
    */
   private final Facade facade = Facade.getInstance();
   
   /**
    * Constructor that creates the main window.
    */
   private MainWindow()
   {
      this.painel = new JPanel( new BorderLayout() );
      this.setupPainel();
      
      this.window = new JFrame( "Ace - Abstract Computers Emulator" );
      this.setupWindow();
   }
   
   /**
    * Returns the only main window existing instance, using lazy creation.
    * 
    * @return instance
    */
   public static MainWindow getInstance()
   {
      synchronized( MainWindow.class )
      {
         if( MainWindow.instance == null )
         {
            MainWindow.instance = new MainWindow();
         }
      }
      return MainWindow.instance;
   }
   
   /**
    * TODO
    */
   private void setupPainel()
   {
      // TODO
   }
   
   /**
    * Configures the main window first opening.
    */
   private void setupWindow()
   {
      this.painel.setDoubleBuffered( true );
      this.window.add( this.painel );
      
      this.window.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
      this.window.setExtendedState( Frame.MAXIMIZED_BOTH );
      
      this.window.pack();
      this.window.setVisible( true );
   }
}
