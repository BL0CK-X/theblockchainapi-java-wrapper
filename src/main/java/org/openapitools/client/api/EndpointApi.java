/*
 * The Blockchain API
 * # About  Our vision is to make it super easy to interact with the decentralized web. We want you to be able to do this in any coding language and do it easily and quickly.   You're a key part of our vision. We love feature requests! <a href=\"#section/Feature-Requests\">Make one!</a>  # How to Use the API  To use the API, you simply need to create an API key pair.  Doing so takes less than a minute. Simply go to <a target=\"_blank\" href=\"https://dashboard.blockchainapi.com\">the dashboard</a>, create an account, and generate a key pair. You can now use this pair to make API requests. You must create your first pair via the dashboard.  # Feature Requests  Got a feature request? Submit it as an issue on <a target=\"_blank\" href=\"https://github.com/BL0CK-X/the-blockchain-api/issues/new/choose\">our GitHub repo</a> or [email us](mailto:info@blockchainapi.com).  # Contact  <figure>     <img          width=\"40px\"         height=\"40px\"          src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/phone.svg\"     />     <figcaption style=\"textAlign:center;\">Text / Call: +1 (415) 888 4745 </figcaption> </figure> <a href=\"mailto:info@blockchainapi.com\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/email.svg\"         />         <figcaption style=\"textAlign:center;\">Email us: info@blockchainapi.com</figcaption>     </figure> </a> <a href=\"https://discord.gg/d49yzrZRAF\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/discord.svg\"         />         <figcaption style=\"textAlign:center;\">Join our Discord</figcaption>     </figure> </a> <a href=\"https://twitter.com/_BlockX_\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/twitter.svg\"         />          <figcaption style=\"textAlign:center;\">Follow us on Twitter</figcaption>     </figure> </a> <a href=\"https://github.com/BL0CK-X/the-blockchain-api\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/github.svg\"         />         <figcaption style=\"textAlign:center;\">Star us on Github</figcaption>     </figure> </a>  # Security  Common dogma is to never give out your seed phrase. We agree. It's a matter of security, and anyone who has your seed phrase can irreversibly empty your wallet.   <b>When using an API endpoint that requires a seed phrase, we highly recommend that users use or create a wallet that they do not use as their primary wallet.</b>   How you make this work depends on what you're doing. If you're minting an NFT for example, we recommend creating a new wallet and then transferring just enough SOL to that wallet to mint the NFT. This is possible on Solana because such transactions cost less than a penny. We will have more tutorials in the future that make it easier for you to be secure when using our API.  We have easy-to-use endpoints for <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1secret_recovery_phrase/post\">creating a new seed phrase</a> and then <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1public_key/post\">deriving a public key</a> to enable you to transfer to that new wallet.  Let's have a constructive dialog about this. Feel free to <a href=\"#section/Contact\">contact us</a>. I made a video discussing this matter <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.  Note: We have had a couple of individuals harrass and threaten us. These individuals did <b>not</b> try our API or speak to anyone who has used it. They simply saw that we require a seed phrase for certain endpoints and figured that the proper response was to attack us. (I explain why we do <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.) Such harrassment and threats are not only harmful, but they are also illegal, and we will report offenders. Do not harrass us. Rather, feel free to discuss your concerns with us and we will be more than happy to work with you to come up with a solution.  # Pricing  <b>Each user receives 100 free credits. Each user can call endpoints that cost 0 credits up to 50 requests/min before being rate-limited.</b> Thereafter, they can upgrade to have a higher rate limit. The purpose of this is to act like a free trial -- not to function like a freemium model where one can stay on the free tier indefinitely.  You can learn more about our pricing <a href=\"https://dashboard.blockchainapi.com/billing\" target=\"_blank\">here</a>.   We frequently do custom plans. If our pricing doesn't work for you, <a href=\"#section/Contact\">contact us</a>.  If you have questions, concerns, feedback, or ideas, <a href=\"#section/Contact\">contact us</a>.  # SDKs / API Wrappers  We have examples using both our <a href=\"https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples\" target=\"_blank\">Python wrapper and our JavaScript wrapper here</a>.  We have built a custom <a href=\"https://github.com/BL0CK-X/the-blockchain-api-python-wrapper\" target=\"_blank\">Python wrapper</a>.  `pip install theblockchainapi`  We also have published a <a href=\"https://github.com/BL0CK-X/theblockchainapi-javascript-wrapper\" target=\"_blank\">JavaScript Wrapper</a>.  `npm install theblockchainapi`  We also have auto-generated wrappers for the following languages: - <a href=\"https://github.com/BL0CK-X/theblockchainapi-go-wrapper\" target = \"_blank\">Go</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-java-wrapper\" target = \"_blank\">Java</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-kotlin-wrapper\" target = \"_blank\">Kotlin</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-php-wrapper\" target = \"_blank\">PHP</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-swift-wrapper\" target = \"_blank\">Swift5</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-typescript-wrapper\" target = \"_blank\">TypeScript</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-csharp-wrapper\" target = \"_blank\">C#</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-dart-wrapper\" target = \"_blank\">Dart</a>  If you would like a different language as well, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.  If you run into any bugs with the wrappers, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.
 *
 * The version of the OpenAPI document: null
 * Contact: info@blockchainapi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.Endpoint;
import org.openapitools.client.model.EndpointReference;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EndpointApi {
    private ApiClient localVarApiClient;

    public EndpointApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EndpointApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for deleteEndpoint
     * @param endpointReference  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response.  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteEndpointCall(EndpointReference endpointReference, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = endpointReference;

        // create path and map variables
        String localVarPath = "/endpoint/delete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "APIKeyID", "APISecretKey" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteEndpointValidateBeforeCall(EndpointReference endpointReference, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = deleteEndpointCall(endpointReference, _callback);
        return localVarCall;

    }

    /**
     * Delete an endpoint 
     * A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Deletes an endpoint from a project. This endpoint removes the endpoint from the project&#39;s documentation. However, this does un-deploy the endpoint. To do so, you must &lt;a href&#x3D;\&quot;#operation/deployProject\&quot;&gt;deploy the project&lt;/a&gt;.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param endpointReference  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response.  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public void deleteEndpoint(EndpointReference endpointReference) throws ApiException {
        deleteEndpointWithHttpInfo(endpointReference);
    }

    /**
     * Delete an endpoint 
     * A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Deletes an endpoint from a project. This endpoint removes the endpoint from the project&#39;s documentation. However, this does un-deploy the endpoint. To do so, you must &lt;a href&#x3D;\&quot;#operation/deployProject\&quot;&gt;deploy the project&lt;/a&gt;.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param endpointReference  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response.  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteEndpointWithHttpInfo(EndpointReference endpointReference) throws ApiException {
        okhttp3.Call localVarCall = deleteEndpointValidateBeforeCall(endpointReference, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete an endpoint  (asynchronously)
     * A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Deletes an endpoint from a project. This endpoint removes the endpoint from the project&#39;s documentation. However, this does un-deploy the endpoint. To do so, you must &lt;a href&#x3D;\&quot;#operation/deployProject\&quot;&gt;deploy the project&lt;/a&gt;.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param endpointReference  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response.  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteEndpointAsync(EndpointReference endpointReference, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteEndpointValidateBeforeCall(endpointReference, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getEndpoint
     * @param endpointReference  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response.  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEndpointCall(EndpointReference endpointReference, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = endpointReference;

        // create path and map variables
        String localVarPath = "/endpoint/metadata";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "APIKeyID", "APISecretKey" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getEndpointValidateBeforeCall(EndpointReference endpointReference, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getEndpointCall(endpointReference, _callback);
        return localVarCall;

    }

    /**
     * Get an endpoint&#39;s metadata 
     * A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Get an endpoint&#39;s metadata from a project.   &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param endpointReference  (optional)
     * @return Endpoint
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response.  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public Endpoint getEndpoint(EndpointReference endpointReference) throws ApiException {
        ApiResponse<Endpoint> localVarResp = getEndpointWithHttpInfo(endpointReference);
        return localVarResp.getData();
    }

    /**
     * Get an endpoint&#39;s metadata 
     * A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Get an endpoint&#39;s metadata from a project.   &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param endpointReference  (optional)
     * @return ApiResponse&lt;Endpoint&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response.  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Endpoint> getEndpointWithHttpInfo(EndpointReference endpointReference) throws ApiException {
        okhttp3.Call localVarCall = getEndpointValidateBeforeCall(endpointReference, null);
        Type localVarReturnType = new TypeToken<Endpoint>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get an endpoint&#39;s metadata  (asynchronously)
     * A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Get an endpoint&#39;s metadata from a project.   &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param endpointReference  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response.  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEndpointAsync(EndpointReference endpointReference, final ApiCallback<Endpoint> _callback) throws ApiException {

        okhttp3.Call localVarCall = getEndpointValidateBeforeCall(endpointReference, _callback);
        Type localVarReturnType = new TypeToken<Endpoint>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listEndpoints
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response.  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listEndpointsCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/endpoint/list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "APIKeyID", "APISecretKey" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listEndpointsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listEndpointsCall(_callback);
        return localVarCall;

    }

    /**
     * List all endpoints 
     * A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  List all endpoints that you have added under your account.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @return List&lt;Endpoint&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response.  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public List<Endpoint> listEndpoints() throws ApiException {
        ApiResponse<List<Endpoint>> localVarResp = listEndpointsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * List all endpoints 
     * A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  List all endpoints that you have added under your account.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @return ApiResponse&lt;List&lt;Endpoint&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response.  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Endpoint>> listEndpointsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = listEndpointsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<Endpoint>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List all endpoints  (asynchronously)
     * A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  List all endpoints that you have added under your account.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response.  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listEndpointsAsync(final ApiCallback<List<Endpoint>> _callback) throws ApiException {

        okhttp3.Call localVarCall = listEndpointsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<Endpoint>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for setEndpoint
     * @param endpoint  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response.  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setEndpointCall(Endpoint endpoint, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = endpoint;

        // create path and map variables
        String localVarPath = "/endpoint";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "APIKeyID", "APISecretKey" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setEndpointValidateBeforeCall(Endpoint endpoint, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = setEndpointCall(endpoint, _callback);
        return localVarCall;

    }

    /**
     * Create / update an endpoint 
     * A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Create or update an &#x60;endpoint&#x60; for a &#x60;project&#x60;.   An &#x60;endpoint&#x60; is a function that is a part of a mini-API &#x60;project&#x60;.  This endpoint adds the &#x60;endpoint&#x60; to the &#x60;project&#x60;&#39;s documentation. However, this does not deploy the &#x60;endpoint&#x60;. To do so, you must &lt;a href&#x3D;\&quot;#operation/deployProject\&quot;&gt;deploy the project&lt;/a&gt;.  All attributes except &#x60;group_name&#x60; are required if **creating** an &#x60;endpoint&#x60;.  Only &#x60;path&#x60;, &#x60;project_id&#x60;, and &#x60;version&#x60; are required if **updating** an &#x60;endpoint&#x60;.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param endpoint  (optional)
     * @return Endpoint
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response.  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public Endpoint setEndpoint(Endpoint endpoint) throws ApiException {
        ApiResponse<Endpoint> localVarResp = setEndpointWithHttpInfo(endpoint);
        return localVarResp.getData();
    }

    /**
     * Create / update an endpoint 
     * A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Create or update an &#x60;endpoint&#x60; for a &#x60;project&#x60;.   An &#x60;endpoint&#x60; is a function that is a part of a mini-API &#x60;project&#x60;.  This endpoint adds the &#x60;endpoint&#x60; to the &#x60;project&#x60;&#39;s documentation. However, this does not deploy the &#x60;endpoint&#x60;. To do so, you must &lt;a href&#x3D;\&quot;#operation/deployProject\&quot;&gt;deploy the project&lt;/a&gt;.  All attributes except &#x60;group_name&#x60; are required if **creating** an &#x60;endpoint&#x60;.  Only &#x60;path&#x60;, &#x60;project_id&#x60;, and &#x60;version&#x60; are required if **updating** an &#x60;endpoint&#x60;.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param endpoint  (optional)
     * @return ApiResponse&lt;Endpoint&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response.  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Endpoint> setEndpointWithHttpInfo(Endpoint endpoint) throws ApiException {
        okhttp3.Call localVarCall = setEndpointValidateBeforeCall(endpoint, null);
        Type localVarReturnType = new TypeToken<Endpoint>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create / update an endpoint  (asynchronously)
     * A complete example and walkthrough of the program can be found &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/api-developer-program\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Create or update an &#x60;endpoint&#x60; for a &#x60;project&#x60;.   An &#x60;endpoint&#x60; is a function that is a part of a mini-API &#x60;project&#x60;.  This endpoint adds the &#x60;endpoint&#x60; to the &#x60;project&#x60;&#39;s documentation. However, this does not deploy the &#x60;endpoint&#x60;. To do so, you must &lt;a href&#x3D;\&quot;#operation/deployProject\&quot;&gt;deploy the project&lt;/a&gt;.  All attributes except &#x60;group_name&#x60; are required if **creating** an &#x60;endpoint&#x60;.  Only &#x60;path&#x60;, &#x60;project_id&#x60;, and &#x60;version&#x60; are required if **updating** an &#x60;endpoint&#x60;.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param endpoint  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response.  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setEndpointAsync(Endpoint endpoint, final ApiCallback<Endpoint> _callback) throws ApiException {

        okhttp3.Call localVarCall = setEndpointValidateBeforeCall(endpoint, _callback);
        Type localVarReturnType = new TypeToken<Endpoint>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
