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

package ace.data_store;

/**
 * Its purpose here is to be a facade to the graphical_interface layer communicating to the
 * system_logic layer.
 */
public final class Facade
{
   private static final Facade INSTANCE;
   
   static
   {
      INSTANCE = new Facade();
   }
   
   private Facade()
   {
   }
   
   /**
    * Returns the only facade existing instance, using early initialization.
    *
    * @return INSTANCE
    */
   public static Facade getInstance()
   {
      return Facade.INSTANCE;
   }
}
