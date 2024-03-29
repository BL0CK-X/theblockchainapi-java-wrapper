/*
 * The Blockchain API
 * # About  Our vision is to make it super easy to interact with the decentralized web. We want you to be able to do this in any coding language and do it easily and quickly.   You're a key part of our vision. We love feature requests! <a href=\"#section/Feature-Requests\">Make one!</a>  # How to Use the API  To use the API, you simply need to create an API key pair.  Doing so takes less than a minute. Simply go to <a target=\"_blank\" href=\"https://dashboard.blockchainapi.com\">the dashboard</a>, create an account, and generate a key pair. You can now use this pair to make API requests. You must create your first pair via the dashboard.  # Feature Requests  Got a feature request? Submit it as an issue on <a target=\"_blank\" href=\"https://github.com/BL0CK-X/the-blockchain-api/issues/new/choose\">our GitHub repo</a> or [email us](mailto:info@blockchainapi.com).  # Contact  <figure>     <img          width=\"40px\"         height=\"40px\"          src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/phone.svg\"     />     <figcaption style=\"textAlign:center;\">Text / Call: +1 (415) 888 4745 </figcaption> </figure> <a href=\"mailto:info@blockchainapi.com\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/email.svg\"         />         <figcaption style=\"textAlign:center;\">Email us: info@blockchainapi.com</figcaption>     </figure> </a> <a href=\"https://discord.gg/d49yzrZRAF\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/discord.svg\"         />         <figcaption style=\"textAlign:center;\">Join our Discord</figcaption>     </figure> </a> <a href=\"https://twitter.com/BlockchainAP1\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/twitter.svg\"         />          <figcaption style=\"textAlign:center;\">Follow us on Twitter</figcaption>     </figure> </a> <a href=\"https://github.com/BL0CK-X/the-blockchain-api\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/github.svg\"         />         <figcaption style=\"textAlign:center;\">Star us on Github</figcaption>     </figure> </a>  # Security  Common dogma is to never give out your seed phrase. We agree. It's a matter of security, and anyone who has your seed phrase can irreversibly empty your wallet.   <b>When using an API endpoint that requires a seed phrase, we highly recommend that users use or create a wallet that they do not use as their primary wallet.</b>   How you make this work depends on what you're doing. If you're minting an NFT for example, we recommend creating a new wallet and then transferring just enough SOL to that wallet to mint the NFT. This is possible on Solana because such transactions cost less than a penny. We will have more tutorials in the future that make it easier for you to be secure when using our API.  We have easy-to-use endpoints for <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1secret_recovery_phrase/post\">creating a new seed phrase</a> and then <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1public_key/post\">deriving a public key</a> to enable you to transfer to that new wallet.  Let's have a constructive dialog about this. Feel free to <a href=\"#section/Contact\">contact us</a>. I made a video discussing this matter <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.  Note: We have had a couple of individuals harrass and threaten us. These individuals did <b>not</b> try our API or speak to anyone who has used it. They simply saw that we require a seed phrase for certain endpoints and figured that the proper response was to attack us. (I explain why we do <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.) Such harrassment and threats are not only harmful, but they are also illegal, and we will report offenders. Do not harrass us. Rather, feel free to discuss your concerns with us and we will be more than happy to work with you to come up with a solution.  # Pricing  <b>Each user receives 50,000 free credits each month.</b> Each endpoint costs a certain amount credits. Scroll below to any endpoint (i.e., function) to see how much each endpoint costs. (Or CMD+F `Cost: 0 Credit`, for example)  You can learn more about our pricing <a href=\"https://dashboard.blockchainapi.com/billing\" target=\"_blank\">here</a>.   We frequently do custom plans. If our pricing doesn't work for you, <a href=\"#section/Contact\">contact us</a>.  If you have questions, concerns, feedback, or ideas, <a href=\"#section/Contact\">contact us</a>.  # SDKs / API Wrappers  We have examples using both our <a href=\"https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples\" target=\"_blank\">Python wrapper and our JavaScript wrapper here</a>.  We have built a custom <a href=\"https://github.com/BL0CK-X/the-blockchain-api-python-wrapper\" target=\"_blank\">Python wrapper</a>.  `pip install theblockchainapi`  We also have published a <a href=\"https://github.com/BL0CK-X/theblockchainapi-javascript-wrapper\" target=\"_blank\">JavaScript Wrapper</a>.  `npm install theblockchainapi`  We also have auto-generated wrappers for the following languages: - <a href=\"https://github.com/BL0CK-X/theblockchainapi-go-wrapper\" target = \"_blank\">Go</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-java-wrapper\" target = \"_blank\">Java</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-kotlin-wrapper\" target = \"_blank\">Kotlin</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-php-wrapper\" target = \"_blank\">PHP</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-swift-wrapper\" target = \"_blank\">Swift5</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-typescript-wrapper\" target = \"_blank\">TypeScript</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-csharp-wrapper\" target = \"_blank\">C#</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-dart-wrapper\" target = \"_blank\">Dart</a>  If you would like a different language as well, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.  If you run into any bugs with the wrappers, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.
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


import org.openapitools.client.model.CCWebhook;
import org.openapitools.client.model.CCWebhookValidateRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CcWebhookApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CcWebhookApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CcWebhookApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getCCWebhook
     * @param projectId The ID of the project. Created and returned when a project is created. (required)
     * @param webhookIdentifier The ID of the webhook. Created and returned when a webhook is sent. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate limited </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCCWebhookCall(String projectId, String webhookIdentifier, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/webhook/v1/project/{project_id}/webhook/{webhook_identifier}"
            .replaceAll("\\{" + "project_id" + "\\}", localVarApiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "webhook_identifier" + "\\}", localVarApiClient.escapeString(webhookIdentifier.toString()));

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "APIKeyID", "APISecretKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCCWebhookValidateBeforeCall(String projectId, String webhookIdentifier, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling getCCWebhook(Async)");
        }
        
        // verify the required parameter 'webhookIdentifier' is set
        if (webhookIdentifier == null) {
            throw new ApiException("Missing the required parameter 'webhookIdentifier' when calling getCCWebhook(Async)");
        }
        

        okhttp3.Call localVarCall = getCCWebhookCall(projectId, webhookIdentifier, _callback);
        return localVarCall;

    }

    /**
     * Get a webhook 
     * Retrieve the details of a webhook sent to you.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param projectId The ID of the project. Created and returned when a project is created. (required)
     * @param webhookIdentifier The ID of the webhook. Created and returned when a webhook is sent. (required)
     * @return CCWebhook
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate limited </td><td>  -  </td></tr>
     </table>
     */
    public CCWebhook getCCWebhook(String projectId, String webhookIdentifier) throws ApiException {
        ApiResponse<CCWebhook> localVarResp = getCCWebhookWithHttpInfo(projectId, webhookIdentifier);
        return localVarResp.getData();
    }

    /**
     * Get a webhook 
     * Retrieve the details of a webhook sent to you.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param projectId The ID of the project. Created and returned when a project is created. (required)
     * @param webhookIdentifier The ID of the webhook. Created and returned when a webhook is sent. (required)
     * @return ApiResponse&lt;CCWebhook&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate limited </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CCWebhook> getCCWebhookWithHttpInfo(String projectId, String webhookIdentifier) throws ApiException {
        okhttp3.Call localVarCall = getCCWebhookValidateBeforeCall(projectId, webhookIdentifier, null);
        Type localVarReturnType = new TypeToken<CCWebhook>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a webhook  (asynchronously)
     * Retrieve the details of a webhook sent to you.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param projectId The ID of the project. Created and returned when a project is created. (required)
     * @param webhookIdentifier The ID of the webhook. Created and returned when a webhook is sent. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate limited </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCCWebhookAsync(String projectId, String webhookIdentifier, final ApiCallback<CCWebhook> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCCWebhookValidateBeforeCall(projectId, webhookIdentifier, _callback);
        Type localVarReturnType = new TypeToken<CCWebhook>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listCCProjectWebhooks
     * @param projectId The ID of the project. Created and returned when a project is created. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate limited </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listCCProjectWebhooksCall(String projectId, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/webhook/v1/project/{project_id}/webhooks"
            .replaceAll("\\{" + "project_id" + "\\}", localVarApiClient.escapeString(projectId.toString()));

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "APIKeyID", "APISecretKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listCCProjectWebhooksValidateBeforeCall(String projectId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling listCCProjectWebhooks(Async)");
        }
        

        okhttp3.Call localVarCall = listCCProjectWebhooksCall(projectId, _callback);
        return localVarCall;

    }

    /**
     * List project&#39;s webhooks 
     * List all webhooks sent to you and their respective responses from your server.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param projectId The ID of the project. Created and returned when a project is created. (required)
     * @return List&lt;CCWebhook&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate limited </td><td>  -  </td></tr>
     </table>
     */
    public List<CCWebhook> listCCProjectWebhooks(String projectId) throws ApiException {
        ApiResponse<List<CCWebhook>> localVarResp = listCCProjectWebhooksWithHttpInfo(projectId);
        return localVarResp.getData();
    }

    /**
     * List project&#39;s webhooks 
     * List all webhooks sent to you and their respective responses from your server.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param projectId The ID of the project. Created and returned when a project is created. (required)
     * @return ApiResponse&lt;List&lt;CCWebhook&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate limited </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<CCWebhook>> listCCProjectWebhooksWithHttpInfo(String projectId) throws ApiException {
        okhttp3.Call localVarCall = listCCProjectWebhooksValidateBeforeCall(projectId, null);
        Type localVarReturnType = new TypeToken<List<CCWebhook>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List project&#39;s webhooks  (asynchronously)
     * List all webhooks sent to you and their respective responses from your server.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param projectId The ID of the project. Created and returned when a project is created. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate limited </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listCCProjectWebhooksAsync(String projectId, final ApiCallback<List<CCWebhook>> _callback) throws ApiException {

        okhttp3.Call localVarCall = listCCProjectWebhooksValidateBeforeCall(projectId, _callback);
        Type localVarReturnType = new TypeToken<List<CCWebhook>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for validateCCWebhook
     * @param projectId The ID of the project. Created and returned when a project is created. (required)
     * @param webhookIdentifier The ID of the webhook. Created and returned when a webhook is sent. (required)
     * @param ccWebhookValidateRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Valid Webhook </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request / invalid webhook (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate limited </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call validateCCWebhookCall(String projectId, String webhookIdentifier, CCWebhookValidateRequest ccWebhookValidateRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = ccWebhookValidateRequest;

        // create path and map variables
        String localVarPath = "/webhook/v1/project/{project_id}/webhook/{webhook_identifier}/validate"
            .replaceAll("\\{" + "project_id" + "\\}", localVarApiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "webhook_identifier" + "\\}", localVarApiClient.escapeString(webhookIdentifier.toString()));

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "APIKeyID", "APISecretKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call validateCCWebhookValidateBeforeCall(String projectId, String webhookIdentifier, CCWebhookValidateRequest ccWebhookValidateRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling validateCCWebhook(Async)");
        }
        
        // verify the required parameter 'webhookIdentifier' is set
        if (webhookIdentifier == null) {
            throw new ApiException("Missing the required parameter 'webhookIdentifier' when calling validateCCWebhook(Async)");
        }
        

        okhttp3.Call localVarCall = validateCCWebhookCall(projectId, webhookIdentifier, ccWebhookValidateRequest, _callback);
        return localVarCall;

    }

    /**
     * Validate a webhook 
     * Validate whether a webhook you received was actually sent from us.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param projectId The ID of the project. Created and returned when a project is created. (required)
     * @param webhookIdentifier The ID of the webhook. Created and returned when a webhook is sent. (required)
     * @param ccWebhookValidateRequest  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Valid Webhook </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request / invalid webhook (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate limited </td><td>  -  </td></tr>
     </table>
     */
    public void validateCCWebhook(String projectId, String webhookIdentifier, CCWebhookValidateRequest ccWebhookValidateRequest) throws ApiException {
        validateCCWebhookWithHttpInfo(projectId, webhookIdentifier, ccWebhookValidateRequest);
    }

    /**
     * Validate a webhook 
     * Validate whether a webhook you received was actually sent from us.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param projectId The ID of the project. Created and returned when a project is created. (required)
     * @param webhookIdentifier The ID of the webhook. Created and returned when a webhook is sent. (required)
     * @param ccWebhookValidateRequest  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Valid Webhook </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request / invalid webhook (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate limited </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> validateCCWebhookWithHttpInfo(String projectId, String webhookIdentifier, CCWebhookValidateRequest ccWebhookValidateRequest) throws ApiException {
        okhttp3.Call localVarCall = validateCCWebhookValidateBeforeCall(projectId, webhookIdentifier, ccWebhookValidateRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Validate a webhook  (asynchronously)
     * Validate whether a webhook you received was actually sent from us.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param projectId The ID of the project. Created and returned when a project is created. (required)
     * @param webhookIdentifier The ID of the webhook. Created and returned when a webhook is sent. (required)
     * @param ccWebhookValidateRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Valid Webhook </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request / invalid webhook (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate limited </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call validateCCWebhookAsync(String projectId, String webhookIdentifier, CCWebhookValidateRequest ccWebhookValidateRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = validateCCWebhookValidateBeforeCall(projectId, webhookIdentifier, ccWebhookValidateRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
