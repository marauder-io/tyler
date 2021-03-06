package io.marauder.tyler.store

import io.marauder.charged.models.GeoJSON

interface StoreClient {
    fun setTile(x: Int, y: Int, z: Int, tile: String)
    fun setTile(x: Int, y: Int, z: Int, tile: ByteArray)
    fun getTile(x: Int, y: Int, z: Int): ByteArray?
    fun getTileJson(x: Int, y: Int, z: Int): String?
    suspend fun serveTile(x: Int, y: Int, z: Int, properties: List<String> = emptyList(), filter: List<List<Double>> = emptyList()) : ByteArray?
    fun deleteTile(x: Int, y: Int, z: Int)
    fun clearStore()
    fun updateTile(x: Int, y: Int, z: Int, tile: String, layer: String = "")
    fun updateTile(x: Int, y: Int, z: Int, tile: ByteArray)
    fun updateTile(x: Int, y: Int, z: Int, tile: GeoJSON, layer: String = "")
}