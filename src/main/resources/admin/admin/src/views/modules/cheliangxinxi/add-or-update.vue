<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row>
                        <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="车辆名称" prop="cheliangmingcheng">
          <el-input v-model="ruleForm.cheliangmingcheng" 
              placeholder="车辆名称" clearable  :readonly="ro.cheliangmingcheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="车辆名称" prop="cheliangmingcheng">
              <el-input v-model="ruleForm.cheliangmingcheng" 
                placeholder="车辆名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="车牌号码" prop="chepaihaoma">
          <el-input v-model="ruleForm.chepaihaoma" 
              placeholder="车牌号码" clearable  :readonly="ro.chepaihaoma"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="车牌号码" prop="chepaihaoma">
              <el-input v-model="ruleForm.chepaihaoma" 
                placeholder="车牌号码" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="车辆品牌" prop="cheliangpinpai">
          <el-select v-model="ruleForm.cheliangpinpai" placeholder="请选择车辆品牌">
            <el-option
                v-for="(item,index) in cheliangpinpaiOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="车辆品牌" prop="cheliangpinpai">
	      <el-input v-model="ruleForm.cheliangpinpai"
                placeholder="车辆品牌" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="车辆类型" prop="cheliangleixing">
          <el-select v-model="ruleForm.cheliangleixing" placeholder="请选择车辆类型">
            <el-option
                v-for="(item,index) in cheliangleixingOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="车辆类型" prop="cheliangleixing">
	      <el-input v-model="ruleForm.cheliangleixing"
                placeholder="车辆类型" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="24">  
        <el-form-item class="upload" v-if="type!='info' && !ro.cheliangzhaopian" label="车辆照片" prop="cheliangzhaopian">
          <file-upload
          tip="点击上传车辆照片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.cheliangzhaopian?ruleForm.cheliangzhaopian:''"
          @change="cheliangzhaopianUploadChange"
          ></file-upload>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.cheliangzhaopian" label="车辆照片" prop="cheliangzhaopian">
            <img style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.cheliangzhaopian.split(',')" :src="item" width="100" height="100">
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="车辆颜色" prop="cheliangyanse">
          <el-select v-model="ruleForm.cheliangyanse" placeholder="请选择车辆颜色">
            <el-option
                v-for="(item,index) in cheliangyanseOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="车辆颜色" prop="cheliangyanse">
	      <el-input v-model="ruleForm.cheliangyanse"
                placeholder="车辆颜色" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="换挡方式" prop="huandangfangshi">
          <el-select v-model="ruleForm.huandangfangshi" placeholder="请选择换挡方式">
            <el-option
                v-for="(item,index) in huandangfangshiOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="换挡方式" prop="huandangfangshi">
	      <el-input v-model="ruleForm.huandangfangshi"
                placeholder="换挡方式" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="车辆天窗" prop="cheliangtianchuang">
          <el-input v-model="ruleForm.cheliangtianchuang" 
              placeholder="车辆天窗" clearable  :readonly="ro.cheliangtianchuang"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="车辆天窗" prop="cheliangtianchuang">
              <el-input v-model="ruleForm.cheliangtianchuang" 
                placeholder="车辆天窗" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="车座" prop="chezuo">
          <el-select v-model="ruleForm.chezuo" placeholder="请选择车座">
            <el-option
                v-for="(item,index) in chezuoOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="车座" prop="chezuo">
	      <el-input v-model="ruleForm.chezuo"
                placeholder="车座" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="租赁价格" prop="zulinjiage">
          <el-input v-model="ruleForm.zulinjiage" 
              placeholder="租赁价格" clearable  :readonly="ro.zulinjiage"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="租赁价格" prop="zulinjiage">
              <el-input v-model="ruleForm.zulinjiage" 
                placeholder="租赁价格" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="车辆详情" prop="cheliangxiangqing">
          <el-input v-model="ruleForm.cheliangxiangqing" 
              placeholder="车辆详情" clearable  :readonly="ro.cheliangxiangqing"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="车辆详情" prop="cheliangxiangqing">
              <el-input v-model="ruleForm.cheliangxiangqing" 
                placeholder="车辆详情" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                                                                                <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="倒计结束时间" prop="reversetime">
            <el-date-picker
                value-format="yyyy-MM-dd HH:mm:ss"
                v-model="ruleForm.reversetime" 
                type="datetime"
                placeholder="倒计结束时间">
            </el-date-picker>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.reversetime" label="倒计结束时间" prop="reversetime">
              <el-input v-model="ruleForm.reversetime" 
                placeholder="倒计结束时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                              </el-row>
                                                                                                                                                                                                                                                                                                                                                                                                                          <el-form-item class="btn">
                <el-button v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    
    
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"rgba(55, 50, 50, 1)","selectFontSize":"14px","btnCancelBorderColor":"rgba(64, 158, 255, 1)","inputBorderRadius":"4px","inputFontSize":"14px","textareaBgColor":"rgba(252, 251, 251, 1)","btnSaveFontSize":"14px","textareaBorderRadius":"4px","uploadBgColor":"rgba(252, 251, 251, 1)","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"rgba(252, 251, 251, 1)","btnSaveBorderRadius":"8px","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"#606266","addEditBoxColor":"rgba(228, 221, 221, 0.17)","dateIconFontSize":"14px","btnSaveBgColor":"rgba(136, 238, 122, 1)","uploadIconFontColor":"#8c939d","textareaBorderColor":"#DCDFE6","btnCancelBgColor":"rgba(232, 198, 111, 1)","selectLableColor":"#606266","btnSaveBorderStyle":"solid","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"4px","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"#C0C4CC","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"#606266","dateBorderColor":"#DCDFE6","dateIconFontColor":"#C0C4CC","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"#606266","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"rgba(14, 14, 14, 1)","uploadHeight":"148px","textareaLableColor":"#606266","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"8px","inputBgColor":"rgba(252, 251, 251, 1)","inputLableFontSize":"14px","uploadLableColor":"#606266","uploadBorderRadius":"4px","btnSaveHeight":"44px","selectBgColor":"rgba(252, 251, 251, 1)","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"#DCDFE6","inputBorderColor":"rgba(192, 193, 197, 0.21)","uploadBorderColor":"#DCDFE6","textareaFontColor":"#606266","selectBorderWidth":"1px","dateFontColor":"#606266","btnCancelBorderWidth":"1px","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"4px","selectFontColor":"#606266","btnSaveBorderColor":"rgba(64, 158, 255, 1)","btnSaveBorderWidth":"1px"},
      id: '',
      type: '',
      ro:{
	cheliangmingcheng : false,
	chepaihaoma : false,
	cheliangpinpai : false,
	cheliangleixing : false,
	cheliangzhaopian : false,
	cheliangyanse : false,
	huandangfangshi : false,
	cheliangtianchuang : false,
	chezuo : false,
	zulinjiage : false,
	cheliangxiangqing : false,
	thumbsupnum : false,
	crazilynum : false,
	reversetime : false,
      },
            ruleForm: {
                	        cheliangmingcheng: '',
	                        	        chepaihaoma: '',
	                        	        cheliangpinpai: '',
	                        	        cheliangleixing: '',
	                        	        cheliangzhaopian: '',
	                        	        cheliangyanse: '',
	                        	        huandangfangshi: '',
	                        	        cheliangtianchuang: '',
	                        	        chezuo: '',
	                        	        zulinjiage: '',
	                        	        cheliangxiangqing: '',
	                        	                        	                        	        reversetime: '',
	                      },
                                                    cheliangpinpaiOptions: [],
                                cheliangleixingOptions: [],
                                              cheliangyanseOptions: [],
                                huandangfangshiOptions: [],
                                              chezuoOptions: [],
                                                                                          rules: {
                  cheliangmingcheng: [
                                    	                                                              ],
                  chepaihaoma: [
                                    	                                                              ],
                  cheliangpinpai: [
                                    	                                                              ],
                  cheliangleixing: [
                                    	                                                              ],
                  cheliangzhaopian: [
                                    	                                                              ],
                  cheliangyanse: [
                                    	                                                              ],
                  huandangfangshi: [
                                    	                                                              ],
                  cheliangtianchuang: [
                                    	                                                              ],
                  chezuo: [
                                    	                                                              ],
                  zulinjiage: [
                                        { validator: validateIntNumber, trigger: 'blur' },
                        	                                                              ],
                  cheliangxiangqing: [
                                    	                                                              ],
                  thumbsupnum: [
                                        { validator: validateIntNumber, trigger: 'blur' },
                        	                                                              ],
                  crazilynum: [
                                        { validator: validateIntNumber, trigger: 'blur' },
                        	                                                              ],
                  reversetime: [
                                    	                                                              ],
              }
    };
  },
  props: ["parent"],
  computed: {
                                                                                                                                                                              },
  created() {
	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
        // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          	            if(o=='cheliangmingcheng'){
            this.ruleForm.cheliangmingcheng = obj[o];
	    this.ro.cheliangmingcheng = true;
            continue;
          }
	            	            if(o=='chepaihaoma'){
            this.ruleForm.chepaihaoma = obj[o];
	    this.ro.chepaihaoma = true;
            continue;
          }
	            	            if(o=='cheliangpinpai'){
            this.ruleForm.cheliangpinpai = obj[o];
	    this.ro.cheliangpinpai = true;
            continue;
          }
	            	            if(o=='cheliangleixing'){
            this.ruleForm.cheliangleixing = obj[o];
	    this.ro.cheliangleixing = true;
            continue;
          }
	            	            if(o=='cheliangzhaopian'){
            this.ruleForm.cheliangzhaopian = obj[o];
	    this.ro.cheliangzhaopian = true;
            continue;
          }
	            	            if(o=='cheliangyanse'){
            this.ruleForm.cheliangyanse = obj[o];
	    this.ro.cheliangyanse = true;
            continue;
          }
	            	            if(o=='huandangfangshi'){
            this.ruleForm.huandangfangshi = obj[o];
	    this.ro.huandangfangshi = true;
            continue;
          }
	            	            if(o=='cheliangtianchuang'){
            this.ruleForm.cheliangtianchuang = obj[o];
	    this.ro.cheliangtianchuang = true;
            continue;
          }
	            	            if(o=='chezuo'){
            this.ruleForm.chezuo = obj[o];
	    this.ro.chezuo = true;
            continue;
          }
	            	            if(o=='zulinjiage'){
            this.ruleForm.zulinjiage = obj[o];
	    this.ro.zulinjiage = true;
            continue;
          }
	            	            if(o=='cheliangxiangqing'){
            this.ruleForm.cheliangxiangqing = obj[o];
	    this.ro.cheliangxiangqing = true;
            continue;
          }
	            	            if(o=='thumbsupnum'){
            this.ruleForm.thumbsupnum = obj[o];
	    this.ro.thumbsupnum = true;
            continue;
          }
	            	            if(o=='crazilynum'){
            this.ruleForm.crazilynum = obj[o];
	    this.ro.crazilynum = true;
            continue;
          }
	            	            if(o=='reversetime'){
            this.ruleForm.reversetime = obj[o];
	    this.ro.reversetime = true;
            continue;
          }
	                    }
                                                                                                                                                                                                                                              }
            // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
                                                                                                                                                                                                                                                                                                                                      } else {
          this.$message.error(data.msg);
        }
      });
                                                                              this.$http({
              url: `option/cheliangpinpai/pinpai`,
              method: "get"
            }).then(({ data }) => {
              if (data && data.code === 0) {
                this.cheliangpinpaiOptions = data.data;
              } else {
                this.$message.error(data.msg);
              }
            });
         
                                        this.cheliangleixingOptions = "轿车,商务车,跑车,越野车,跑车".split(',')
                                                          this.$http({
              url: `option/cheliangyanse/yanse`,
              method: "get"
            }).then(({ data }) => {
              if (data && data.code === 0) {
                this.cheliangyanseOptions = data.data;
              } else {
                this.$message.error(data.msg);
              }
            });
         
                                        this.huandangfangshiOptions = "手波,自动波".split(',')
                                                          this.chezuoOptions = "两座,四座,五座,六座,七座m八座".split(',')
                                                                                                                      },
                                                                                                                        // 多级联动参数
                                                                                                                                                        info(id) {
      this.$http({
        url: `cheliangxinxi/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },
        // 提交
    onSubmit() {
                  // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                                                                                                                                                                                                                                                                                                this.$refs["ruleForm"].validate(valid => {
        if (valid) {
          this.$http({
            url: `cheliangxinxi/${!this.ruleForm.id ? "save" : "update"}`,
            method: "post",
            data: this.ruleForm
          }).then(({ data }) => {
            if (data && data.code === 0) {
              this.$message({
                message: "操作成功",
                type: "success",
                duration: 1500,
                onClose: () => {
                  this.parent.showFlag = true;
                  this.parent.addOrUpdateFlag = false;
                  this.parent.cheliangxinxiCrossAddOrUpdateFlag = false;
                  this.parent.search();
                  this.parent.contentStyleChange();
                }
              });
            } else {
              this.$message.error(data.msg);
            }
          });
        }
      });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.cheliangxinxiCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
                                                                        cheliangzhaopianUploadChange(fileUrls) {
                this.ruleForm.cheliangzhaopian = fileUrls;
				this.addEditUploadStyleChange()
            },
                                                                                                                        	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
}
.btn .el-button {
  padding: 0;
}
</style>
