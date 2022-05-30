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


import org.openapitools.client.model.Account;
import org.openapitools.client.model.AccountIsCandyMachine;
import org.openapitools.client.model.AccountIsNFT;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolanaAccountApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SolanaAccountApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SolanaAccountApi(ApiClient apiClient) {
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
     * Build call for solanaGetAccount
     * @param network The network ID (devnet, mainnet-beta) (required)
     * @param publicKey The public key of the account (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Account found. Details in response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input or issue retrieving transaction. See response for details </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Task not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call solanaGetAccountCall(String network, String publicKey, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/solana/account/{network}/{public_key}"
            .replaceAll("\\{" + "network" + "\\}", localVarApiClient.escapeString(network.toString()))
            .replaceAll("\\{" + "public_key" + "\\}", localVarApiClient.escapeString(publicKey.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call solanaGetAccountValidateBeforeCall(String network, String publicKey, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'network' is set
        if (network == null) {
            throw new ApiException("Missing the required parameter 'network' when calling solanaGetAccount(Async)");
        }
        
        // verify the required parameter 'publicKey' is set
        if (publicKey == null) {
            throw new ApiException("Missing the required parameter 'publicKey' when calling solanaGetAccount(Async)");
        }
        

        okhttp3.Call localVarCall = solanaGetAccountCall(network, publicKey, _callback);
        return localVarCall;

    }

    /**
     * Get the details of an account on Solana
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-account/get-account\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Get the details of an account on Solana. Learn more about accounts &lt;a href&#x3D;\&quot;https://docs.solana.com/developing/programming-model/accounts\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  &#x60;Cost: 0.25 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param network The network ID (devnet, mainnet-beta) (required)
     * @param publicKey The public key of the account (required)
     * @return Account
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Account found. Details in response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input or issue retrieving transaction. See response for details </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Task not found. </td><td>  -  </td></tr>
     </table>
     */
    public Account solanaGetAccount(String network, String publicKey) throws ApiException {
        ApiResponse<Account> localVarResp = solanaGetAccountWithHttpInfo(network, publicKey);
        return localVarResp.getData();
    }

    /**
     * Get the details of an account on Solana
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-account/get-account\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Get the details of an account on Solana. Learn more about accounts &lt;a href&#x3D;\&quot;https://docs.solana.com/developing/programming-model/accounts\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  &#x60;Cost: 0.25 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param network The network ID (devnet, mainnet-beta) (required)
     * @param publicKey The public key of the account (required)
     * @return ApiResponse&lt;Account&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Account found. Details in response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input or issue retrieving transaction. See response for details </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Task not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Account> solanaGetAccountWithHttpInfo(String network, String publicKey) throws ApiException {
        okhttp3.Call localVarCall = solanaGetAccountValidateBeforeCall(network, publicKey, null);
        Type localVarReturnType = new TypeToken<Account>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the details of an account on Solana (asynchronously)
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-account/get-account\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Get the details of an account on Solana. Learn more about accounts &lt;a href&#x3D;\&quot;https://docs.solana.com/developing/programming-model/accounts\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  &#x60;Cost: 0.25 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param network The network ID (devnet, mainnet-beta) (required)
     * @param publicKey The public key of the account (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Account found. Details in response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input or issue retrieving transaction. See response for details </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Task not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call solanaGetAccountAsync(String network, String publicKey, final ApiCallback<Account> _callback) throws ApiException {

        okhttp3.Call localVarCall = solanaGetAccountValidateBeforeCall(network, publicKey, _callback);
        Type localVarReturnType = new TypeToken<Account>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for solanaGetAccountIsCandyMachine
     * @param network The network ID (devnet, mainnet-beta) (required)
     * @param publicKey The public key of the account (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input or issue retrieving transaction. See response for details </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Task not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call solanaGetAccountIsCandyMachineCall(String network, String publicKey, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/solana/account/{network}/{public_key}/is_candy_machine"
            .replaceAll("\\{" + "network" + "\\}", localVarApiClient.escapeString(network.toString()))
            .replaceAll("\\{" + "public_key" + "\\}", localVarApiClient.escapeString(publicKey.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call solanaGetAccountIsCandyMachineValidateBeforeCall(String network, String publicKey, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'network' is set
        if (network == null) {
            throw new ApiException("Missing the required parameter 'network' when calling solanaGetAccountIsCandyMachine(Async)");
        }
        
        // verify the required parameter 'publicKey' is set
        if (publicKey == null) {
            throw new ApiException("Missing the required parameter 'publicKey' when calling solanaGetAccountIsCandyMachine(Async)");
        }
        

        okhttp3.Call localVarCall = solanaGetAccountIsCandyMachineCall(network, publicKey, _callback);
        return localVarCall;

    }

    /**
     * Get if account is candy machine
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-account/get-is-candy-machine\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Determine whether or not a public key address corresponds to a candy machine ID or candy machine configuration.  &#x60;Cost: 1 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param network The network ID (devnet, mainnet-beta) (required)
     * @param publicKey The public key of the account (required)
     * @return AccountIsCandyMachine
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input or issue retrieving transaction. See response for details </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Task not found. </td><td>  -  </td></tr>
     </table>
     */
    public AccountIsCandyMachine solanaGetAccountIsCandyMachine(String network, String publicKey) throws ApiException {
        ApiResponse<AccountIsCandyMachine> localVarResp = solanaGetAccountIsCandyMachineWithHttpInfo(network, publicKey);
        return localVarResp.getData();
    }

    /**
     * Get if account is candy machine
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-account/get-is-candy-machine\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Determine whether or not a public key address corresponds to a candy machine ID or candy machine configuration.  &#x60;Cost: 1 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param network The network ID (devnet, mainnet-beta) (required)
     * @param publicKey The public key of the account (required)
     * @return ApiResponse&lt;AccountIsCandyMachine&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input or issue retrieving transaction. See response for details </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Task not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccountIsCandyMachine> solanaGetAccountIsCandyMachineWithHttpInfo(String network, String publicKey) throws ApiException {
        okhttp3.Call localVarCall = solanaGetAccountIsCandyMachineValidateBeforeCall(network, publicKey, null);
        Type localVarReturnType = new TypeToken<AccountIsCandyMachine>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get if account is candy machine (asynchronously)
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-account/get-is-candy-machine\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Determine whether or not a public key address corresponds to a candy machine ID or candy machine configuration.  &#x60;Cost: 1 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param network The network ID (devnet, mainnet-beta) (required)
     * @param publicKey The public key of the account (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input or issue retrieving transaction. See response for details </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Task not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call solanaGetAccountIsCandyMachineAsync(String network, String publicKey, final ApiCallback<AccountIsCandyMachine> _callback) throws ApiException {

        okhttp3.Call localVarCall = solanaGetAccountIsCandyMachineValidateBeforeCall(network, publicKey, _callback);
        Type localVarReturnType = new TypeToken<AccountIsCandyMachine>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for solanaGetAccountIsNFT
     * @param network The network ID (devnet, mainnet-beta) (required)
     * @param publicKey The public key of the account (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input or issue retrieving transaction. See response for details </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Task not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call solanaGetAccountIsNFTCall(String network, String publicKey, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/solana/account/{network}/{public_key}/is_nft"
            .replaceAll("\\{" + "network" + "\\}", localVarApiClient.escapeString(network.toString()))
            .replaceAll("\\{" + "public_key" + "\\}", localVarApiClient.escapeString(publicKey.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call solanaGetAccountIsNFTValidateBeforeCall(String network, String publicKey, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'network' is set
        if (network == null) {
            throw new ApiException("Missing the required parameter 'network' when calling solanaGetAccountIsNFT(Async)");
        }
        
        // verify the required parameter 'publicKey' is set
        if (publicKey == null) {
            throw new ApiException("Missing the required parameter 'publicKey' when calling solanaGetAccountIsNFT(Async)");
        }
        

        okhttp3.Call localVarCall = solanaGetAccountIsNFTCall(network, publicKey, _callback);
        return localVarCall;

    }

    /**
     * Get if account is NFT
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-account/get-is-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Determine whether or not a public key is an NFT &#x60;mint address&#x60;  &#x60;Cost: 0.5 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param network The network ID (devnet, mainnet-beta) (required)
     * @param publicKey The public key of the account (required)
     * @return AccountIsNFT
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input or issue retrieving transaction. See response for details </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Task not found. </td><td>  -  </td></tr>
     </table>
     */
    public AccountIsNFT solanaGetAccountIsNFT(String network, String publicKey) throws ApiException {
        ApiResponse<AccountIsNFT> localVarResp = solanaGetAccountIsNFTWithHttpInfo(network, publicKey);
        return localVarResp.getData();
    }

    /**
     * Get if account is NFT
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-account/get-is-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Determine whether or not a public key is an NFT &#x60;mint address&#x60;  &#x60;Cost: 0.5 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param network The network ID (devnet, mainnet-beta) (required)
     * @param publicKey The public key of the account (required)
     * @return ApiResponse&lt;AccountIsNFT&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input or issue retrieving transaction. See response for details </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Task not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccountIsNFT> solanaGetAccountIsNFTWithHttpInfo(String network, String publicKey) throws ApiException {
        okhttp3.Call localVarCall = solanaGetAccountIsNFTValidateBeforeCall(network, publicKey, null);
        Type localVarReturnType = new TypeToken<AccountIsNFT>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get if account is NFT (asynchronously)
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-account/get-is-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Determine whether or not a public key is an NFT &#x60;mint address&#x60;  &#x60;Cost: 0.5 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param network The network ID (devnet, mainnet-beta) (required)
     * @param publicKey The public key of the account (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input or issue retrieving transaction. See response for details </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Task not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call solanaGetAccountIsNFTAsync(String network, String publicKey, final ApiCallback<AccountIsNFT> _callback) throws ApiException {

        okhttp3.Call localVarCall = solanaGetAccountIsNFTValidateBeforeCall(network, publicKey, _callback);
        Type localVarReturnType = new TypeToken<AccountIsNFT>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
