# Produk API 

## Create Produk
Endpoint : POST /api/produk

request body :
```json
{
    "nama" : "produk a",
    "harga" : "23000",
    "deskripsi" : "Produk a produk terbaik",

}
```

response body (success):
```json
{
    "msg" : "Produk berhasil ditambahkan",
}
```

response body (failed) :
```json
{
    "msg" : "Produk tidak berhasil ditambahkan",
}
```

