/**********************************************************************
Copyright (c) 2005 Erik Bengtson and others. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.


Contributions
    ...
***********************************************************************/
package org.jpox.samples.many_many;

/**
 * Oil Supplier.
 *
 * @version $Revision: 1.1 $    
 */
public class OilSupplier extends PetroleumSupplier
{
    /** Brand name */
    protected String brandName=null;

    /** Constructor. */
    public OilSupplier(String name)
    {
        super(name);
    }
    
    /**
     * Accessor for brand name
     * @return brandName brand name
     */
    public String getBrandName()
    {
        return brandName;
    }
    
    /**
     * Accessor for brand name
     * @param brandName brand name
     */
    public void setBrandName(String brandName)
    {
        this.brandName = brandName;
    }
    
    public String toString()
    {
        return super.toString() + " [brand name : "+ brandName +"]";
    }
}