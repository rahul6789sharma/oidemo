package com.hilti.du.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;

/**
 * Amazon Lambda function used for updating the SmartAssistant Elastic Search indexes.
 */
public class OISyncHandler implements RequestHandler<S3Event, Object> {

	/**
	 * Amazon AWS lambda function that is called when a HTTP put requested on an S3 bucket
	 */
	public Object handleRequest(final S3Event input, final Context context) {
		final LambdaLogger logger = context.getLogger();
		logger.log(String.format("Triggered by %s", input != null ? input.toJson() : "null event"));

		System.out.println("###### Task Done ########");
		return "acknowledged";
	}


}
