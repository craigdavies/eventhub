package com.demo;

import com.microsoft.azure.eventprocessorhost.ExceptionReceivedEventArgs;

import java.util.function.Consumer;
import java.util.logging.Logger;

/**
 * Created by CraigDavies on 23/01/2019.
 */
// The general notification handler is an object that derives from Consumer<> and takes an ExceptionReceivedEventArgs object
// as an argument. The argument provides the details of the error: the exception that occurred and the action (what EventProcessorHost
// was doing) during which the error occurred. The complete list of actions can be found in EventProcessorHostActionStrings.
public class ErrorNotificationHandler implements Consumer<ExceptionReceivedEventArgs>
{
    @Override
    public void accept(ExceptionReceivedEventArgs t)
    {
        System.out.println("Trailers: Host " + t.getHostname() + " received general error notification during " + t.getAction() + ": " + t.getException().toString());
    }
}
