

# BalanceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**publicKey** | **String** | The public key address of the wallet | 
**unit** | [**UnitEnum**](#UnitEnum) | If you are retrieving the SOL balance, you can select whether to retrieve this in SOL or Lamport units (1 SOL &#x3D; 1e9 Lamports). |  [optional]
**network** | [**NetworkEnum**](#NetworkEnum) |  |  [optional]
**mintAddress** | **String** | The mint address of the SPL token. If not provided, the balance returned is in SOL. Make sure to use the correct network.  Some example mint addresses: - USDC: EPjFWdd5AufqSSqeM2qN1xzybapC8G4wEGGkZwyTDt1v - Mango: MangoCzJ36AjZyKwVj3VnYU4GTonjfVEnJmvvWaxLac - Serum: SRMuApVNdxXokk5GT7XD5cUUgXMBCoAz2LHeuAoKWRt - Raydium: 4k3Dyjzvzp8eMZWUXbBCjEvwSkkk59S5iCNLY3QrkX6R - wSOL: So11111111111111111111111111111111111111112 - ATLAS: ATLASXmbPQxBUYbxPsV97usA3fPQYEqzQBUHgiFCUsXx |  [optional]



## Enum: UnitEnum

Name | Value
---- | -----
LAMPORT | &quot;lamport&quot;
SOL | &quot;sol&quot;



## Enum: NetworkEnum

Name | Value
---- | -----
DEVNET | &quot;devnet&quot;
MAINNET_BETA | &quot;mainnet-beta&quot;



