
package com.district3.d3listview.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Repo {

    @Expose
    private Integer id;
    @Expose
    private Owner owner;
    @Expose
    private String name;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @Expose
    private String description;
    @SerializedName("private")
    @Expose
    private Boolean _private;
    @Expose
    private Boolean fork;
    @Expose
    private String url;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("clone_url")
    @Expose
    private String cloneUrl;
    @SerializedName("git_url")
    @Expose
    private String gitUrl;
    @SerializedName("ssh_url")
    @Expose
    private String sshUrl;
    @SerializedName("svn_url")
    @Expose
    private String svnUrl;
    @SerializedName("mirror_url")
    @Expose
    private String mirrorUrl;
    @Expose
    private String homepage;
    @Expose
    private Object language;
    @SerializedName("forks_count")
    @Expose
    private Integer forksCount;
    @SerializedName("stargazers_count")
    @Expose
    private Integer stargazersCount;
    @SerializedName("watchers_count")
    @Expose
    private Integer watchersCount;
    @Expose
    private Integer size;
    @SerializedName("default_branch")
    @Expose
    private String defaultBranch;
    @SerializedName("open_issues_count")
    @Expose
    private Integer openIssuesCount;
    @SerializedName("has_issues")
    @Expose
    private Boolean hasIssues;
    @SerializedName("has_wiki")
    @Expose
    private Boolean hasWiki;
    @SerializedName("has_pages")
    @Expose
    private Boolean hasPages;
    @SerializedName("has_downloads")
    @Expose
    private Boolean hasDownloads;
    @SerializedName("pushed_at")
    @Expose
    private String pushedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @Expose
    private Permissions permissions;

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * 
     * @param owner
     *     The owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 
     * @param fullName
     *     The full_name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The _private
     */
    public Boolean getPrivate() {
        return _private;
    }

    /**
     * 
     * @param _private
     *     The private
     */
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    /**
     * 
     * @return
     *     The fork
     */
    public Boolean getFork() {
        return fork;
    }

    /**
     * 
     * @param fork
     *     The fork
     */
    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The htmlUrl
     */
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * 
     * @param htmlUrl
     *     The html_url
     */
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     * 
     * @return
     *     The cloneUrl
     */
    public String getCloneUrl() {
        return cloneUrl;
    }

    /**
     * 
     * @param cloneUrl
     *     The clone_url
     */
    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    /**
     * 
     * @return
     *     The gitUrl
     */
    public String getGitUrl() {
        return gitUrl;
    }

    /**
     * 
     * @param gitUrl
     *     The git_url
     */
    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    /**
     * 
     * @return
     *     The sshUrl
     */
    public String getSshUrl() {
        return sshUrl;
    }

    /**
     * 
     * @param sshUrl
     *     The ssh_url
     */
    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    /**
     * 
     * @return
     *     The svnUrl
     */
    public String getSvnUrl() {
        return svnUrl;
    }

    /**
     * 
     * @param svnUrl
     *     The svn_url
     */
    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
    }

    /**
     * 
     * @return
     *     The mirrorUrl
     */
    public String getMirrorUrl() {
        return mirrorUrl;
    }

    /**
     * 
     * @param mirrorUrl
     *     The mirror_url
     */
    public void setMirrorUrl(String mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    /**
     * 
     * @return
     *     The homepage
     */
    public String getHomepage() {
        return homepage;
    }

    /**
     * 
     * @param homepage
     *     The homepage
     */
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    /**
     * 
     * @return
     *     The language
     */
    public Object getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    public void setLanguage(Object language) {
        this.language = language;
    }

    /**
     * 
     * @return
     *     The forksCount
     */
    public Integer getForksCount() {
        return forksCount;
    }

    /**
     * 
     * @param forksCount
     *     The forks_count
     */
    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    /**
     * 
     * @return
     *     The stargazersCount
     */
    public Integer getStargazersCount() {
        return stargazersCount;
    }

    /**
     * 
     * @param stargazersCount
     *     The stargazers_count
     */
    public void setStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    /**
     * 
     * @return
     *     The watchersCount
     */
    public Integer getWatchersCount() {
        return watchersCount;
    }

    /**
     * 
     * @param watchersCount
     *     The watchers_count
     */
    public void setWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
    }

    /**
     * 
     * @return
     *     The size
     */
    public Integer getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The size
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * 
     * @return
     *     The defaultBranch
     */
    public String getDefaultBranch() {
        return defaultBranch;
    }

    /**
     * 
     * @param defaultBranch
     *     The default_branch
     */
    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    /**
     * 
     * @return
     *     The openIssuesCount
     */
    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    /**
     * 
     * @param openIssuesCount
     *     The open_issues_count
     */
    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    /**
     * 
     * @return
     *     The hasIssues
     */
    public Boolean getHasIssues() {
        return hasIssues;
    }

    /**
     * 
     * @param hasIssues
     *     The has_issues
     */
    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    /**
     * 
     * @return
     *     The hasWiki
     */
    public Boolean getHasWiki() {
        return hasWiki;
    }

    /**
     * 
     * @param hasWiki
     *     The has_wiki
     */
    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    /**
     * 
     * @return
     *     The hasPages
     */
    public Boolean getHasPages() {
        return hasPages;
    }

    /**
     * 
     * @param hasPages
     *     The has_pages
     */
    public void setHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
    }

    /**
     * 
     * @return
     *     The hasDownloads
     */
    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    /**
     * 
     * @param hasDownloads
     *     The has_downloads
     */
    public void setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    /**
     * 
     * @return
     *     The pushedAt
     */
    public String getPushedAt() {
        return pushedAt;
    }

    /**
     * 
     * @param pushedAt
     *     The pushed_at
     */
    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt
     *     The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 
     * @return
     *     The permissions
     */
    public Permissions getPermissions() {
        return permissions;
    }

    /**
     * 
     * @param permissions
     *     The permissions
     */
    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

}
