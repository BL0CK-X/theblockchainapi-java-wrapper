

# NFTSearchRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**updateAuthority** | **String** | The public key of the update authority of the NFT |  [optional]
**updateAuthoritySearchMethod** | [**UpdateAuthoritySearchMethodEnum**](#UpdateAuthoritySearchMethodEnum) | Only &#x60;exact_match&#x60; supported at this time |  [optional]
**mintAddress** | **String** | The mint address of the NFT |  [optional]
**mintAddressSearchMethod** | [**MintAddressSearchMethodEnum**](#MintAddressSearchMethodEnum) | Only &#x60;exact_match&#x60; supported at this time |  [optional]
**name** | **String** | The name of the NFT |  [optional]
**nameSearchMethod** | [**NameSearchMethodEnum**](#NameSearchMethodEnum) |  |  [optional]
**uri** | **String** | The NFT&#39;s uri |  [optional]
**uriSearchMethod** | [**UriSearchMethodEnum**](#UriSearchMethodEnum) |  |  [optional]
**symbol** | **String** | The symbol associated with the candy machine |  [optional]
**symbolSearchMethod** | [**SymbolSearchMethodEnum**](#SymbolSearchMethodEnum) |  |  [optional]
**network** | [**NetworkEnum**](#NetworkEnum) |  |  [optional]



## Enum: UpdateAuthoritySearchMethodEnum

Name | Value
---- | -----
EXACT_MATCH | &quot;exact_match&quot;



## Enum: MintAddressSearchMethodEnum

Name | Value
---- | -----
EXACT_MATCH | &quot;exact_match&quot;



## Enum: NameSearchMethodEnum

Name | Value
---- | -----
BEGINS_WITH | &quot;begins_with&quot;
EXACT_MATCH | &quot;exact_match&quot;



## Enum: UriSearchMethodEnum

Name | Value
---- | -----
BEGINS_WITH | &quot;begins_with&quot;
EXACT_MATCH | &quot;exact_match&quot;



## Enum: SymbolSearchMethodEnum

Name | Value
---- | -----
BEGINS_WITH | &quot;begins_with&quot;
EXACT_MATCH | &quot;exact_match&quot;



## Enum: NetworkEnum

Name | Value
---- | -----
DEVNET | &quot;devnet&quot;
MAINNET_BETA | &quot;mainnet-beta&quot;



