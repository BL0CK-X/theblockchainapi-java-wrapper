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


import org.openapitools.client.model.BuyRequest;
import org.openapitools.client.model.BuyResponse;
import org.openapitools.client.model.DelistRequest;
import org.openapitools.client.model.DelistResponse;
import org.openapitools.client.model.GetNFTListingResponse;
import org.openapitools.client.model.ListRequest;
import org.openapitools.client.model.ListResponse;
import org.openapitools.client.model.NFTAnalyticsRequest;
import org.openapitools.client.model.NFTAnalyticsResponse;
import org.openapitools.client.model.NFTTransaction;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolanaNftMarketplacesApi {
    private ApiClient localVarApiClient;

    public SolanaNftMarketplacesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SolanaNftMarketplacesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for solanaBuyNFT
     * @param network The network ID (required)
     * @param exchange The NFT exchange to interact with (required)
     * @param mintAddress The mint address of the NFT you want to buy (required)
     * @param buyRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call solanaBuyNFTCall(String network, String exchange, String mintAddress, BuyRequest buyRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = buyRequest;

        // create path and map variables
        String localVarPath = "/solana/nft/marketplaces/{exchange}/buy/{network}/{mint_address}"
            .replaceAll("\\{" + "network" + "\\}", localVarApiClient.escapeString(network.toString()))
            .replaceAll("\\{" + "exchange" + "\\}", localVarApiClient.escapeString(exchange.toString()))
            .replaceAll("\\{" + "mint_address" + "\\}", localVarApiClient.escapeString(mintAddress.toString()));

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
    private okhttp3.Call solanaBuyNFTValidateBeforeCall(String network, String exchange, String mintAddress, BuyRequest buyRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'network' is set
        if (network == null) {
            throw new ApiException("Missing the required parameter 'network' when calling solanaBuyNFT(Async)");
        }
        
        // verify the required parameter 'exchange' is set
        if (exchange == null) {
            throw new ApiException("Missing the required parameter 'exchange' when calling solanaBuyNFT(Async)");
        }
        
        // verify the required parameter 'mintAddress' is set
        if (mintAddress == null) {
            throw new ApiException("Missing the required parameter 'mintAddress' when calling solanaBuyNFT(Async)");
        }
        

        okhttp3.Call localVarCall = solanaBuyNFTCall(network, exchange, mintAddress, buyRequest, _callback);
        return localVarCall;

    }

    /**
     * Buy
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/buy-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Buy an NFT on a Solana Exchange.  Exchanges supported: SolSea, Magic Edennpm  &#x60;Cost: 25 Credits&#x60;, &#x60;Cost: 3 Credits on Devnet&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param network The network ID (required)
     * @param exchange The NFT exchange to interact with (required)
     * @param mintAddress The mint address of the NFT you want to buy (required)
     * @param buyRequest  (optional)
     * @return BuyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public BuyResponse solanaBuyNFT(String network, String exchange, String mintAddress, BuyRequest buyRequest) throws ApiException {
        ApiResponse<BuyResponse> localVarResp = solanaBuyNFTWithHttpInfo(network, exchange, mintAddress, buyRequest);
        return localVarResp.getData();
    }

    /**
     * Buy
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/buy-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Buy an NFT on a Solana Exchange.  Exchanges supported: SolSea, Magic Edennpm  &#x60;Cost: 25 Credits&#x60;, &#x60;Cost: 3 Credits on Devnet&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param network The network ID (required)
     * @param exchange The NFT exchange to interact with (required)
     * @param mintAddress The mint address of the NFT you want to buy (required)
     * @param buyRequest  (optional)
     * @return ApiResponse&lt;BuyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BuyResponse> solanaBuyNFTWithHttpInfo(String network, String exchange, String mintAddress, BuyRequest buyRequest) throws ApiException {
        okhttp3.Call localVarCall = solanaBuyNFTValidateBeforeCall(network, exchange, mintAddress, buyRequest, null);
        Type localVarReturnType = new TypeToken<BuyResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Buy (asynchronously)
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/buy-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Buy an NFT on a Solana Exchange.  Exchanges supported: SolSea, Magic Edennpm  &#x60;Cost: 25 Credits&#x60;, &#x60;Cost: 3 Credits on Devnet&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param network The network ID (required)
     * @param exchange The NFT exchange to interact with (required)
     * @param mintAddress The mint address of the NFT you want to buy (required)
     * @param buyRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call solanaBuyNFTAsync(String network, String exchange, String mintAddress, BuyRequest buyRequest, final ApiCallback<BuyResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = solanaBuyNFTValidateBeforeCall(network, exchange, mintAddress, buyRequest, _callback);
        Type localVarReturnType = new TypeToken<BuyResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for solanaDelistNFT
     * @param network The network ID (required)
     * @param exchange The NFT exchange to interact with (required)
     * @param mintAddress The mint address of the NFT you want to buy (required)
     * @param delistRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call solanaDelistNFTCall(String network, String exchange, String mintAddress, DelistRequest delistRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = delistRequest;

        // create path and map variables
        String localVarPath = "/solana/nft/marketplaces/{exchange}/delist/{network}/{mint_address}"
            .replaceAll("\\{" + "network" + "\\}", localVarApiClient.escapeString(network.toString()))
            .replaceAll("\\{" + "exchange" + "\\}", localVarApiClient.escapeString(exchange.toString()))
            .replaceAll("\\{" + "mint_address" + "\\}", localVarApiClient.escapeString(mintAddress.toString()));

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
    private okhttp3.Call solanaDelistNFTValidateBeforeCall(String network, String exchange, String mintAddress, DelistRequest delistRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'network' is set
        if (network == null) {
            throw new ApiException("Missing the required parameter 'network' when calling solanaDelistNFT(Async)");
        }
        
        // verify the required parameter 'exchange' is set
        if (exchange == null) {
            throw new ApiException("Missing the required parameter 'exchange' when calling solanaDelistNFT(Async)");
        }
        
        // verify the required parameter 'mintAddress' is set
        if (mintAddress == null) {
            throw new ApiException("Missing the required parameter 'mintAddress' when calling solanaDelistNFT(Async)");
        }
        

        okhttp3.Call localVarCall = solanaDelistNFTCall(network, exchange, mintAddress, delistRequest, _callback);
        return localVarCall;

    }

    /**
     * Delist
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/delist-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Delist an NFT from a Solana Exchange.  Exchanges supported: SolSea, Magic Eden  &#x60;Cost: 8 Credits&#x60;, &#x60;Cost: 3 Credits on Devnet&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param network The network ID (required)
     * @param exchange The NFT exchange to interact with (required)
     * @param mintAddress The mint address of the NFT you want to buy (required)
     * @param delistRequest  (optional)
     * @return DelistResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public DelistResponse solanaDelistNFT(String network, String exchange, String mintAddress, DelistRequest delistRequest) throws ApiException {
        ApiResponse<DelistResponse> localVarResp = solanaDelistNFTWithHttpInfo(network, exchange, mintAddress, delistRequest);
        return localVarResp.getData();
    }

    /**
     * Delist
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/delist-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Delist an NFT from a Solana Exchange.  Exchanges supported: SolSea, Magic Eden  &#x60;Cost: 8 Credits&#x60;, &#x60;Cost: 3 Credits on Devnet&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param network The network ID (required)
     * @param exchange The NFT exchange to interact with (required)
     * @param mintAddress The mint address of the NFT you want to buy (required)
     * @param delistRequest  (optional)
     * @return ApiResponse&lt;DelistResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DelistResponse> solanaDelistNFTWithHttpInfo(String network, String exchange, String mintAddress, DelistRequest delistRequest) throws ApiException {
        okhttp3.Call localVarCall = solanaDelistNFTValidateBeforeCall(network, exchange, mintAddress, delistRequest, null);
        Type localVarReturnType = new TypeToken<DelistResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delist (asynchronously)
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/delist-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Delist an NFT from a Solana Exchange.  Exchanges supported: SolSea, Magic Eden  &#x60;Cost: 8 Credits&#x60;, &#x60;Cost: 3 Credits on Devnet&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param network The network ID (required)
     * @param exchange The NFT exchange to interact with (required)
     * @param mintAddress The mint address of the NFT you want to buy (required)
     * @param delistRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call solanaDelistNFTAsync(String network, String exchange, String mintAddress, DelistRequest delistRequest, final ApiCallback<DelistResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = solanaDelistNFTValidateBeforeCall(network, exchange, mintAddress, delistRequest, _callback);
        Type localVarReturnType = new TypeToken<DelistResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for solanaGetNFTListing
     * @param network The network ID (required)
     * @param mintAddress The mint address of the NFT you want to buy (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Our API will throw a 403 if you are providing a body in the GET request.  Such requests are insecure and rejected. The solution is not to provide any sort of body in any GET request.  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No marketplace listing found for this NFT. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call solanaGetNFTListingCall(String network, String mintAddress, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/solana/nft/marketplaces/listing/{network}/{mint_address}"
            .replaceAll("\\{" + "network" + "\\}", localVarApiClient.escapeString(network.toString()))
            .replaceAll("\\{" + "mint_address" + "\\}", localVarApiClient.escapeString(mintAddress.toString()));

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
    private okhttp3.Call solanaGetNFTListingValidateBeforeCall(String network, String mintAddress, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'network' is set
        if (network == null) {
            throw new ApiException("Missing the required parameter 'network' when calling solanaGetNFTListing(Async)");
        }
        
        // verify the required parameter 'mintAddress' is set
        if (mintAddress == null) {
            throw new ApiException("Missing the required parameter 'mintAddress' when calling solanaGetNFTListing(Async)");
        }
        

        okhttp3.Call localVarCall = solanaGetNFTListingCall(network, mintAddress, _callback);
        return localVarCall;

    }

    /**
     * Get NFT Listing
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/get-nft-listing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Get the Marketplace listing of a Solana NFT.  Currently checks the following Solana NFT martketplaces: SolSea, Magic Eden, Solanart, Alpha Art, Digital Eyes, Exchange.art  &#x60;Cost: 1 Credits&#x60;, (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param network The network ID (required)
     * @param mintAddress The mint address of the NFT you want to buy (required)
     * @return GetNFTListingResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Our API will throw a 403 if you are providing a body in the GET request.  Such requests are insecure and rejected. The solution is not to provide any sort of body in any GET request.  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No marketplace listing found for this NFT. </td><td>  -  </td></tr>
     </table>
     */
    public GetNFTListingResponse solanaGetNFTListing(String network, String mintAddress) throws ApiException {
        ApiResponse<GetNFTListingResponse> localVarResp = solanaGetNFTListingWithHttpInfo(network, mintAddress);
        return localVarResp.getData();
    }

    /**
     * Get NFT Listing
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/get-nft-listing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Get the Marketplace listing of a Solana NFT.  Currently checks the following Solana NFT martketplaces: SolSea, Magic Eden, Solanart, Alpha Art, Digital Eyes, Exchange.art  &#x60;Cost: 1 Credits&#x60;, (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param network The network ID (required)
     * @param mintAddress The mint address of the NFT you want to buy (required)
     * @return ApiResponse&lt;GetNFTListingResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Our API will throw a 403 if you are providing a body in the GET request.  Such requests are insecure and rejected. The solution is not to provide any sort of body in any GET request.  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No marketplace listing found for this NFT. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetNFTListingResponse> solanaGetNFTListingWithHttpInfo(String network, String mintAddress) throws ApiException {
        okhttp3.Call localVarCall = solanaGetNFTListingValidateBeforeCall(network, mintAddress, null);
        Type localVarReturnType = new TypeToken<GetNFTListingResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get NFT Listing (asynchronously)
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/get-nft-listing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Get the Marketplace listing of a Solana NFT.  Currently checks the following Solana NFT martketplaces: SolSea, Magic Eden, Solanart, Alpha Art, Digital Eyes, Exchange.art  &#x60;Cost: 1 Credits&#x60;, (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param network The network ID (required)
     * @param mintAddress The mint address of the NFT you want to buy (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Our API will throw a 403 if you are providing a body in the GET request.  Such requests are insecure and rejected. The solution is not to provide any sort of body in any GET request.  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No marketplace listing found for this NFT. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call solanaGetNFTListingAsync(String network, String mintAddress, final ApiCallback<GetNFTListingResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = solanaGetNFTListingValidateBeforeCall(network, mintAddress, _callback);
        Type localVarReturnType = new TypeToken<GetNFTListingResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for solanaGetNFTMarketplaceAnalytics
     * @param nfTAnalyticsRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No marketplace listing found for this NFT. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call solanaGetNFTMarketplaceAnalyticsCall(NFTAnalyticsRequest nfTAnalyticsRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = nfTAnalyticsRequest;

        // create path and map variables
        String localVarPath = "/solana/nft/marketplaces/analytics";

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
    private okhttp3.Call solanaGetNFTMarketplaceAnalyticsValidateBeforeCall(NFTAnalyticsRequest nfTAnalyticsRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = solanaGetNFTMarketplaceAnalyticsCall(nfTAnalyticsRequest, _callback);
        return localVarCall;

    }

    /**
     * Get NFT Analytics
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/analytics\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  A collection is a list of NFTs.  Any collection can thus be defined as a list of mint addresses.  This endpoint takes in a list of mint addresses (effectively, a collection), a start time (optional), and an end time (optional) and outputs the floor for that period, the volume for that period, and the transaction history for each NFT in the list (buy, list, delist, update price) for that period.  We are currently compiling a dictionary of collection names to list of mint addresses for public use. Please contribute &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/solana-nft-collection-mint-addresses\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Currently scans the following Solana NFT martketplaces: SolSea, Magic Eden, Solanart, Alpha Art, Digital Eyes, Exchange.art  &#x60;Cost: 15 Credits&#x60;, (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param nfTAnalyticsRequest  (optional)
     * @return NFTAnalyticsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No marketplace listing found for this NFT. </td><td>  -  </td></tr>
     </table>
     */
    public NFTAnalyticsResponse solanaGetNFTMarketplaceAnalytics(NFTAnalyticsRequest nfTAnalyticsRequest) throws ApiException {
        ApiResponse<NFTAnalyticsResponse> localVarResp = solanaGetNFTMarketplaceAnalyticsWithHttpInfo(nfTAnalyticsRequest);
        return localVarResp.getData();
    }

    /**
     * Get NFT Analytics
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/analytics\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  A collection is a list of NFTs.  Any collection can thus be defined as a list of mint addresses.  This endpoint takes in a list of mint addresses (effectively, a collection), a start time (optional), and an end time (optional) and outputs the floor for that period, the volume for that period, and the transaction history for each NFT in the list (buy, list, delist, update price) for that period.  We are currently compiling a dictionary of collection names to list of mint addresses for public use. Please contribute &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/solana-nft-collection-mint-addresses\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Currently scans the following Solana NFT martketplaces: SolSea, Magic Eden, Solanart, Alpha Art, Digital Eyes, Exchange.art  &#x60;Cost: 15 Credits&#x60;, (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param nfTAnalyticsRequest  (optional)
     * @return ApiResponse&lt;NFTAnalyticsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No marketplace listing found for this NFT. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<NFTAnalyticsResponse> solanaGetNFTMarketplaceAnalyticsWithHttpInfo(NFTAnalyticsRequest nfTAnalyticsRequest) throws ApiException {
        okhttp3.Call localVarCall = solanaGetNFTMarketplaceAnalyticsValidateBeforeCall(nfTAnalyticsRequest, null);
        Type localVarReturnType = new TypeToken<NFTAnalyticsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get NFT Analytics (asynchronously)
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/analytics\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  A collection is a list of NFTs.  Any collection can thus be defined as a list of mint addresses.  This endpoint takes in a list of mint addresses (effectively, a collection), a start time (optional), and an end time (optional) and outputs the floor for that period, the volume for that period, and the transaction history for each NFT in the list (buy, list, delist, update price) for that period.  We are currently compiling a dictionary of collection names to list of mint addresses for public use. Please contribute &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/solana-nft-collection-mint-addresses\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  Currently scans the following Solana NFT martketplaces: SolSea, Magic Eden, Solanart, Alpha Art, Digital Eyes, Exchange.art  &#x60;Cost: 15 Credits&#x60;, (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param nfTAnalyticsRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No marketplace listing found for this NFT. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call solanaGetNFTMarketplaceAnalyticsAsync(NFTAnalyticsRequest nfTAnalyticsRequest, final ApiCallback<NFTAnalyticsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = solanaGetNFTMarketplaceAnalyticsValidateBeforeCall(nfTAnalyticsRequest, _callback);
        Type localVarReturnType = new TypeToken<NFTAnalyticsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for solanaGetNFTMarketplaceMarketShare
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Our API will throw a 403 if you are providing a body in the GET request.  Such requests are insecure and rejected. The solution is not to provide any sort of body in any GET request.  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No marketplace listing found for this NFT. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call solanaGetNFTMarketplaceMarketShareCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/solana/nft/marketplaces/analytics/market_share";

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
    private okhttp3.Call solanaGetNFTMarketplaceMarketShareValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = solanaGetNFTMarketplaceMarketShareCall(_callback);
        return localVarCall;

    }

    /**
     * Get Marketplace Market Share
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/market-share\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Get the Marketplace listing of a Solana NFT.  Currently checks for the following Solana NFT martketplaces: SolSea, Magic Eden, Solanart, Alpha Art, Digital Eyes, Exchange.art  &#x60;Cost: 3 Credits&#x60;, (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Our API will throw a 403 if you are providing a body in the GET request.  Such requests are insecure and rejected. The solution is not to provide any sort of body in any GET request.  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No marketplace listing found for this NFT. </td><td>  -  </td></tr>
     </table>
     */
    public Object solanaGetNFTMarketplaceMarketShare() throws ApiException {
        ApiResponse<Object> localVarResp = solanaGetNFTMarketplaceMarketShareWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get Marketplace Market Share
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/market-share\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Get the Marketplace listing of a Solana NFT.  Currently checks for the following Solana NFT martketplaces: SolSea, Magic Eden, Solanart, Alpha Art, Digital Eyes, Exchange.art  &#x60;Cost: 3 Credits&#x60;, (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Our API will throw a 403 if you are providing a body in the GET request.  Such requests are insecure and rejected. The solution is not to provide any sort of body in any GET request.  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No marketplace listing found for this NFT. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> solanaGetNFTMarketplaceMarketShareWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = solanaGetNFTMarketplaceMarketShareValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Marketplace Market Share (asynchronously)
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/market-share\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Get the Marketplace listing of a Solana NFT.  Currently checks for the following Solana NFT martketplaces: SolSea, Magic Eden, Solanart, Alpha Art, Digital Eyes, Exchange.art  &#x60;Cost: 3 Credits&#x60;, (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Our API will throw a 403 if you are providing a body in the GET request.  Such requests are insecure and rejected. The solution is not to provide any sort of body in any GET request.  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No marketplace listing found for this NFT. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call solanaGetNFTMarketplaceMarketShareAsync(final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = solanaGetNFTMarketplaceMarketShareValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for solanaGetNFTMarketplaceRecentTransactions
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Our API will throw a 403 if you are providing a body in the GET request.  Such requests are insecure and rejected. The solution is not to provide any sort of body in any GET request.  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No marketplace listing found for this NFT. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call solanaGetNFTMarketplaceRecentTransactionsCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/solana/nft/marketplaces/analytics/recent_transactions";

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
    private okhttp3.Call solanaGetNFTMarketplaceRecentTransactionsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = solanaGetNFTMarketplaceRecentTransactionsCall(_callback);
        return localVarCall;

    }

    /**
     * Get Recent NFT Transactions
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/recent-transactions\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Get all NFT transactions across all major marketplaces in the last 30 minutes.  Currently checks for the following Solana NFT martketplaces: SolSea, Magic Eden, Solanart, Alpha Art, Digital Eyes, Exchange.art  &#x60;Cost: 15 Credits&#x60;, (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @return List&lt;NFTTransaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Our API will throw a 403 if you are providing a body in the GET request.  Such requests are insecure and rejected. The solution is not to provide any sort of body in any GET request.  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No marketplace listing found for this NFT. </td><td>  -  </td></tr>
     </table>
     */
    public List<NFTTransaction> solanaGetNFTMarketplaceRecentTransactions() throws ApiException {
        ApiResponse<List<NFTTransaction>> localVarResp = solanaGetNFTMarketplaceRecentTransactionsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get Recent NFT Transactions
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/recent-transactions\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Get all NFT transactions across all major marketplaces in the last 30 minutes.  Currently checks for the following Solana NFT martketplaces: SolSea, Magic Eden, Solanart, Alpha Art, Digital Eyes, Exchange.art  &#x60;Cost: 15 Credits&#x60;, (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @return ApiResponse&lt;List&lt;NFTTransaction&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Our API will throw a 403 if you are providing a body in the GET request.  Such requests are insecure and rejected. The solution is not to provide any sort of body in any GET request.  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No marketplace listing found for this NFT. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<NFTTransaction>> solanaGetNFTMarketplaceRecentTransactionsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = solanaGetNFTMarketplaceRecentTransactionsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<NFTTransaction>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Recent NFT Transactions (asynchronously)
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/recent-transactions\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Get all NFT transactions across all major marketplaces in the last 30 minutes.  Currently checks for the following Solana NFT martketplaces: SolSea, Magic Eden, Solanart, Alpha Art, Digital Eyes, Exchange.art  &#x60;Cost: 15 Credits&#x60;, (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Our API will throw a 403 if you are providing a body in the GET request.  Such requests are insecure and rejected. The solution is not to provide any sort of body in any GET request.  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No marketplace listing found for this NFT. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call solanaGetNFTMarketplaceRecentTransactionsAsync(final ApiCallback<List<NFTTransaction>> _callback) throws ApiException {

        okhttp3.Call localVarCall = solanaGetNFTMarketplaceRecentTransactionsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<NFTTransaction>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for solanaListNFT
     * @param network The network ID (required)
     * @param exchange The NFT exchange to interact with (required)
     * @param mintAddress The mint address of the NFT you want to buy (required)
     * @param listRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call solanaListNFTCall(String network, String exchange, String mintAddress, ListRequest listRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = listRequest;

        // create path and map variables
        String localVarPath = "/solana/nft/marketplaces/{exchange}/list/{network}/{mint_address}"
            .replaceAll("\\{" + "network" + "\\}", localVarApiClient.escapeString(network.toString()))
            .replaceAll("\\{" + "exchange" + "\\}", localVarApiClient.escapeString(exchange.toString()))
            .replaceAll("\\{" + "mint_address" + "\\}", localVarApiClient.escapeString(mintAddress.toString()));

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
    private okhttp3.Call solanaListNFTValidateBeforeCall(String network, String exchange, String mintAddress, ListRequest listRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'network' is set
        if (network == null) {
            throw new ApiException("Missing the required parameter 'network' when calling solanaListNFT(Async)");
        }
        
        // verify the required parameter 'exchange' is set
        if (exchange == null) {
            throw new ApiException("Missing the required parameter 'exchange' when calling solanaListNFT(Async)");
        }
        
        // verify the required parameter 'mintAddress' is set
        if (mintAddress == null) {
            throw new ApiException("Missing the required parameter 'mintAddress' when calling solanaListNFT(Async)");
        }
        

        okhttp3.Call localVarCall = solanaListNFTCall(network, exchange, mintAddress, listRequest, _callback);
        return localVarCall;

    }

    /**
     * List
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/list-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  List an NFT on a Solana Exchange.  Exchanges supported: SolSea, Magic Eden  &#x60;Cost: 12 Credits&#x60;, &#x60;Cost: 3 Credits on Devnet&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param network The network ID (required)
     * @param exchange The NFT exchange to interact with (required)
     * @param mintAddress The mint address of the NFT you want to buy (required)
     * @param listRequest  (optional)
     * @return ListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public ListResponse solanaListNFT(String network, String exchange, String mintAddress, ListRequest listRequest) throws ApiException {
        ApiResponse<ListResponse> localVarResp = solanaListNFTWithHttpInfo(network, exchange, mintAddress, listRequest);
        return localVarResp.getData();
    }

    /**
     * List
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/list-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  List an NFT on a Solana Exchange.  Exchanges supported: SolSea, Magic Eden  &#x60;Cost: 12 Credits&#x60;, &#x60;Cost: 3 Credits on Devnet&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param network The network ID (required)
     * @param exchange The NFT exchange to interact with (required)
     * @param mintAddress The mint address of the NFT you want to buy (required)
     * @param listRequest  (optional)
     * @return ApiResponse&lt;ListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListResponse> solanaListNFTWithHttpInfo(String network, String exchange, String mintAddress, ListRequest listRequest) throws ApiException {
        okhttp3.Call localVarCall = solanaListNFTValidateBeforeCall(network, exchange, mintAddress, listRequest, null);
        Type localVarReturnType = new TypeToken<ListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List (asynchronously)
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-nft-marketplaces/list-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  List an NFT on a Solana Exchange.  Exchanges supported: SolSea, Magic Eden  &#x60;Cost: 12 Credits&#x60;, &#x60;Cost: 3 Credits on Devnet&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     * @param network The network ID (required)
     * @param exchange The NFT exchange to interact with (required)
     * @param mintAddress The mint address of the NFT you want to buy (required)
     * @param listRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (check response message) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid API key pair in headers </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call solanaListNFTAsync(String network, String exchange, String mintAddress, ListRequest listRequest, final ApiCallback<ListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = solanaListNFTValidateBeforeCall(network, exchange, mintAddress, listRequest, _callback);
        Type localVarReturnType = new TypeToken<ListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
