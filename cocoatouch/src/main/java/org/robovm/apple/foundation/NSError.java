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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSError/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSErrorPtr extends Ptr<NSError, NSErrorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSError(SkipInit skipInit) { super(skipInit); }
    public NSError(String domain, @MachineSizedSInt long code, NSDictionary<NSString, ?> dict) { super((SkipInit) null); initObject(initWithDomain$code$userInfo$(domain, code, dict)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "domain")
    public native NSString getDomain();
    @Property(selector = "code")
    public native @MachineSizedSInt long getCode();
    @Property(selector = "userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    @Property(selector = "localizedDescription")
    public native String getLocalizedDescription();
    @Property(selector = "localizedFailureReason")
    public native String getLocalizedFailureReason();
    @Property(selector = "localizedRecoverySuggestion")
    public native String getLocalizedRecoverySuggestion();
    @Property(selector = "localizedRecoveryOptions")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getLocalizedRecoveryOptions();
    @Property(selector = "recoveryAttempter")
    public native NSObject getRecoveryAttempter();
    @Property(selector = "helpAnchor")
    public native String getHelpAnchor();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDomain:code:userInfo:")
    protected native @Pointer long initWithDomain$code$userInfo$(String domain, @MachineSizedSInt long code, NSDictionary<NSString, ?> dict);
    /*</methods>*/
}
