/*
 * Copyright 2018 Seven Seals Technology
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yuanbenlian.model.http;

import com.google.gson.annotations.SerializedName;
import com.yuanbenlian.util.GsonUtil;

/**
 * <p>查询最新的blockHash的结果封装</p>
 * <p>the latest block hash and block height</p>
 */
public class BlockHashQueryResp {
    public class BlockHashResp {
        @SerializedName(value = "latest_block_height")
        private Long latestBlockHeight;
        @SerializedName(value = "latest_block_hash")
        private String latestBlockHash;
        @SerializedName(value = "latest_block_time")
        private String latestBlockTime;

        public Long getLatestBlockHeight() {
            return latestBlockHeight;
        }

        public void setLatestBlockHeight(Long latestBlockHeight) {
            this.latestBlockHeight = latestBlockHeight;
        }

        public String getLatestBlockHash() {
            return latestBlockHash;
        }

        public void setLatestBlockHash(String latestBlockHash) {
            this.latestBlockHash = latestBlockHash;
        }

        public String getLatestBlockTime() {
            return latestBlockTime;
        }

        public void setLatestBlockTime(String latestBlockTime) {
            this.latestBlockTime = latestBlockTime;
        }
    }

    /**
     * 如果code为"ok",表示请求数据成功
     * ok : success
     */
    private String code;
    /**
     * 返回的错误信息
     * error message
     */
    private String msg;
    private BlockHashResp data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public BlockHashResp getData() {
        return data;
    }

    public void setData(BlockHashResp data) {
        this.data = data;
    }

    public String toJson() {
        return GsonUtil.getInstance().toJson(this);
    }
}
