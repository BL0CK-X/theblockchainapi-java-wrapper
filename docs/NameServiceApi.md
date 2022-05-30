# NameServiceApi

All URIs are relative to *https://api.blockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBlockchainIdentifierFromName**](NameServiceApi.md#getBlockchainIdentifierFromName) | **POST** /{blockchain}/{network}/name_service/name_to_blockchain_identifier | Get the identifier
[**getNameForBlockchainIdentifier**](NameServiceApi.md#getNameForBlockchainIdentifier) | **POST** /{blockchain}/{network}/name_service/blockchain_identifier_to_name | Get the name


<a name="getBlockchainIdentifierFromName"></a>
# **getBlockchainIdentifierFromName**
> InputBlockchainIdentifier getBlockchainIdentifierFromName(blockchain, network, inputName)

Get the identifier

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript) [Coming Soon]&lt;/a&gt;.      Get the blockchain identifier from a name.  e.g., Input &#x60;vitalik.eth&#x60; and output &#x60;0xd8dA6BF26964aF9D7eEd9e03E53415D37aA96045&#x60;  &#x60;Cost: 0.25 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NameServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.blockchainapi.com/v1");
    
    // Configure API key authorization: APIKeyID
    ApiKeyAuth APIKeyID = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyID");
    APIKeyID.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyID.setApiKeyPrefix("Token");

    // Configure API key authorization: APISecretKey
    ApiKeyAuth APISecretKey = (ApiKeyAuth) defaultClient.getAuthentication("APISecretKey");
    APISecretKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APISecretKey.setApiKeyPrefix("Token");

    NameServiceApi apiInstance = new NameServiceApi(defaultClient);
    String blockchain = "ethereum"; // String | The blockchain you want to use 
    String network = "ropsten"; // String | The network of the blockchain you selected  - Solana: `devnet`, `mainnet-beta` - Ethereum: `ropsten`, `mainnet`  Defaults when not provided (not applicable to path parameters): - Solana: `devnet` - Ethereum: `ropsten`
    InputName inputName = new InputName(); // InputName | 
    try {
      InputBlockchainIdentifier result = apiInstance.getBlockchainIdentifierFromName(blockchain, network, inputName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NameServiceApi#getBlockchainIdentifierFromName");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchain** | **String**| The blockchain you want to use  | [enum: ethereum, solana]
 **network** | **String**| The network of the blockchain you selected  - Solana: &#x60;devnet&#x60;, &#x60;mainnet-beta&#x60; - Ethereum: &#x60;ropsten&#x60;, &#x60;mainnet&#x60;  Defaults when not provided (not applicable to path parameters): - Solana: &#x60;devnet&#x60; - Ethereum: &#x60;ropsten&#x60; |
 **inputName** | [**InputName**](InputName.md)|  | [optional]

### Return type

[**InputBlockchainIdentifier**](InputBlockchainIdentifier.md)

### Authorization

[APIKeyID](../README.md#APIKeyID), [APISecretKey](../README.md#APISecretKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**400** | Invalid input or issue retrieving transaction. See response for details |  -  |
**401** | Invalid API key pair in headers |  -  |
**402** | Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. |  -  |
**404** | Task not found. |  -  |

<a name="getNameForBlockchainIdentifier"></a>
# **getNameForBlockchainIdentifier**
> InputName getNameForBlockchainIdentifier(blockchain, network, blockchainIdentifier, inputBlockchainIdentifier)

Get the name

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript) [Coming Soon]&lt;/a&gt;.      Get the name from a blockchain identifier.  e.g., Input &#x60;0xd8dA6BF26964aF9D7eEd9e03E53415D37aA96045&#x60; and output &#x60;vitalik.eth&#x60;  &#x60;Cost: 0.25 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NameServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.blockchainapi.com/v1");
    
    // Configure API key authorization: APIKeyID
    ApiKeyAuth APIKeyID = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyID");
    APIKeyID.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyID.setApiKeyPrefix("Token");

    // Configure API key authorization: APISecretKey
    ApiKeyAuth APISecretKey = (ApiKeyAuth) defaultClient.getAuthentication("APISecretKey");
    APISecretKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APISecretKey.setApiKeyPrefix("Token");

    NameServiceApi apiInstance = new NameServiceApi(defaultClient);
    String blockchain = "ethereum"; // String | The blockchain you want to use 
    String network = "ropsten"; // String | The network of the blockchain you selected  - Solana: `devnet`, `mainnet-beta` - Ethereum: `ropsten`, `mainnet`  Defaults when not provided (not applicable to path parameters): - Solana: `devnet` - Ethereum: `ropsten`
    String blockchainIdentifier = "ethereum"; // String | The identifier of the token (e.g., `mint_address` on `Solana` or `token_address` on `Ethereum`) 
    InputBlockchainIdentifier inputBlockchainIdentifier = new InputBlockchainIdentifier(); // InputBlockchainIdentifier | 
    try {
      InputName result = apiInstance.getNameForBlockchainIdentifier(blockchain, network, blockchainIdentifier, inputBlockchainIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NameServiceApi#getNameForBlockchainIdentifier");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchain** | **String**| The blockchain you want to use  | [enum: ethereum, solana]
 **network** | **String**| The network of the blockchain you selected  - Solana: &#x60;devnet&#x60;, &#x60;mainnet-beta&#x60; - Ethereum: &#x60;ropsten&#x60;, &#x60;mainnet&#x60;  Defaults when not provided (not applicable to path parameters): - Solana: &#x60;devnet&#x60; - Ethereum: &#x60;ropsten&#x60; |
 **blockchainIdentifier** | **String**| The identifier of the token (e.g., &#x60;mint_address&#x60; on &#x60;Solana&#x60; or &#x60;token_address&#x60; on &#x60;Ethereum&#x60;)  | [enum: ethereum, solana]
 **inputBlockchainIdentifier** | [**InputBlockchainIdentifier**](InputBlockchainIdentifier.md)|  | [optional]

### Return type

[**InputName**](InputName.md)

### Authorization

[APIKeyID](../README.md#APIKeyID), [APISecretKey](../README.md#APISecretKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**400** | Invalid input or issue retrieving transaction. See response for details |  -  |
**401** | Invalid API key pair in headers |  -  |
**402** | Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. |  -  |
**404** | Task not found. |  -  |

