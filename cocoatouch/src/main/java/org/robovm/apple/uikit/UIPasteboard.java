/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.uikit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 3.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIPasteboard/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIPasteboardPtr extends Ptr<UIPasteboard, UIPasteboardPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIPasteboard.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIPasteboard() {}
    protected UIPasteboard(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "isPersistent")
    public native boolean isPersistent();
    @Property(selector = "setPersistent:")
    public native void setPersistent(boolean v);
    @Property(selector = "changeCount")
    public native @MachineSizedSInt long getChangeCount();
    @Property(selector = "numberOfItems")
    public native @MachineSizedSInt long getNumberOfItems();
    @Property(selector = "items")
    public native NSArray<NSDictionary<NSString, ?>> getItems();
    @Property(selector = "setItems:")
    public native void setItems(NSArray<NSDictionary<NSString, ?>> v);
    @Property(selector = "string")
    public native String getString();
    @Property(selector = "setString:")
    public native void setString(String v);
    @Property(selector = "strings")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getStrings();
    @Property(selector = "setStrings:")
    public native void setStrings(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    @Property(selector = "URL")
    public native NSURL getURL();
    @Property(selector = "setURL:")
    public native void setURL(NSURL v);
    @Property(selector = "URLs")
    public native NSArray<NSURL> getURLs();
    @Property(selector = "setURLs:")
    public native void setURLs(NSArray<NSURL> v);
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    @Property(selector = "images")
    public native NSArray<UIImage> getImages();
    @Property(selector = "setImages:")
    public native void setImages(NSArray<UIImage> v);
    @Property(selector = "color")
    public native UIColor getColor();
    @Property(selector = "setColor:")
    public native void setColor(UIColor v);
    @Property(selector = "colors")
    public native NSArray<UIColor> getColors();
    @Property(selector = "setColors:")
    public native void setColors(NSArray<UIColor> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "pasteboardTypes")
    public native NSArray<NSString> getTypes();
    @Method(selector = "containsPasteboardTypes:")
    public native boolean contains(NSArray<NSString> pasteboardTypes);
    @Method(selector = "dataForPasteboardType:")
    public native NSData getData(String pasteboardType);
    @Method(selector = "valueForPasteboardType:")
    public native NSObject getValue(String pasteboardType);
    @Method(selector = "setValue:forPasteboardType:")
    public native void setValue(NSObject value, String pasteboardType);
    @Method(selector = "setData:forPasteboardType:")
    public native void setData(NSData data, String pasteboardType);
    @Method(selector = "pasteboardTypesForItemSet:")
    public native NSArray<NSArray<NSString>> getTypes(NSIndexSet itemSet);
    @Method(selector = "containsPasteboardTypes:inItemSet:")
    public native boolean contains(NSArray<NSString> pasteboardTypes, NSIndexSet itemSet);
    @Method(selector = "itemSetWithPasteboardTypes:")
    public native NSIndexSet getItemsWithTypes(NSArray<NSString> pasteboardTypes);
    @Method(selector = "valuesForPasteboardType:inItemSet:")
    public native NSArray<?> getValues(String pasteboardType, NSIndexSet itemSet);
    @Method(selector = "dataForPasteboardType:inItemSet:")
    public native NSArray<NSData> getData(String pasteboardType, NSIndexSet itemSet);
    @Method(selector = "addItems:")
    public native void addItems(NSArray<NSDictionary<NSString, ?>> items);
    @Method(selector = "generalPasteboard")
    public static native UIPasteboard getGeneral();
    @Method(selector = "pasteboardWithName:create:")
    public static native UIPasteboard create(String pasteboardName, boolean create);
    @Method(selector = "pasteboardWithUniqueName")
    public static native UIPasteboard getUnique();
    @Method(selector = "removePasteboardWithName:")
    public static native void remove(String pasteboardName);
    /*</methods>*/
}
